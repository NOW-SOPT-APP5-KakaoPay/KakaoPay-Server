package org.sopt.kakaopay.service;

import lombok.RequiredArgsConstructor;
import org.sopt.kakaopay.common.dto.ErrorMessage;
import org.sopt.kakaopay.domain.Bookmark;
import org.sopt.kakaopay.domain.Member;
import org.sopt.kakaopay.exception.NotFoundException;
import org.sopt.kakaopay.repository.BookmarkRepository;
import org.sopt.kakaopay.service.dto.BookmarkDeleteDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository bookmarkRepository;
    private final MemberService memberService;

    public Boolean existsBySourceMemberAndTargetMember(Member sourceMember, Member targetMember){
        return bookmarkRepository.existsBySourceMemberAndTargetMember(sourceMember, targetMember);
    }

    @Transactional
    public void deleteBookmark(Long memberId, BookmarkDeleteDto bookmarkDeleteDto) {
        Member sourceMember = memberService.findMemberById(memberId);
        Member targetMember = memberService.findMemberByBankAndBankAccount(bookmarkDeleteDto.bank(),
                bookmarkDeleteDto.bankAccount());
        Bookmark bookmark = bookmarkRepository.findBySourceMemberAndTargetMember(sourceMember, targetMember).orElseThrow(
                () -> new NotFoundException(ErrorMessage.BOOKMARK_NOT_FOUND)
        );
        bookmarkRepository.delete(bookmark);
    }
}
