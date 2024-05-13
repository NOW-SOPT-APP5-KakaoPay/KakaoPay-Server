package org.sopt.kakaopay.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.kakaopay.service.MemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/vi/member")
public class MemberController {
    private final MemberService memberService;
}
