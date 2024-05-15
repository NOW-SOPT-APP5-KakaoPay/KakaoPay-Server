package org.sopt.kakaopay.service;

import lombok.RequiredArgsConstructor;
import org.sopt.kakaopay.common.dto.ErrorMessage;
import org.sopt.kakaopay.domain.Member;
import org.sopt.kakaopay.exception.NotFoundException;
import org.sopt.kakaopay.repository.MemberRepository;
import org.sopt.kakaopay.service.dto.PayMoneyFindDto;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Member findMemberById(Long memerId){
        return memberRepository.findById(memerId).orElseThrow(
                () -> new NotFoundException(ErrorMessage.MEMBER_NOT_FOUND)
        );
    }

    public PayMoneyFindDto findPayMoneyById(Long memerId){
        Member member = findMemberById(memerId);
        return PayMoneyFindDto.of(member);
    }
}
