package org.sopt.kakaopay.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.kakaopay.service.HistoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/history")
public class HistoryController {
    private final HistoryService historyService;
}
