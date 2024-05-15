package org.sopt.kakaopay.service;

import jakarta.transaction.Transactional;
import java.awt.print.Book;
import lombok.RequiredArgsConstructor;
import org.sopt.kakaopay.domain.Bookmark;
import org.sopt.kakaopay.domain.Member;
import org.sopt.kakaopay.repository.BookmarkRepository;
import org.sopt.kakaopay.service.dto.BookmarkAddDto;
import org.sopt.kakaopay.common.dto.ErrorMessage;
import org.sopt.kakaopay.exception.NotFoundException;
import org.sopt.kakaopay.service.dto.BookmarkDeleteDto;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository bookmarkRepository;
    private final MemberService memberService;

    @Transactional
    public void AddBookmark(Long memberId, BookmarkAddDto bookmarkAddDto) {
        Member sourceMember = memberService.findMemberById(memberId);
        Member targetMember = memberService.findMemberByBankAndBankAccount(bookmarkAddDto.bank(),
            bookmarkAddDto.bankAccount());
        Bookmark bookmark = new Bookmark(sourceMember, targetMember);

        bookmarkRepository.save(bookmark);

    }

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

