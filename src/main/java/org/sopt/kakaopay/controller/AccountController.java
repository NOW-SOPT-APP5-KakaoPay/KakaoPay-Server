package org.sopt.kakaopay.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.kakaopay.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/account")
public class AccountController {
    private final AccountService accountService;
}
