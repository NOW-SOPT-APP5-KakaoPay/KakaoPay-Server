package org.sopt.kakaopay.service;

import lombok.RequiredArgsConstructor;
import org.sopt.kakaopay.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
}
