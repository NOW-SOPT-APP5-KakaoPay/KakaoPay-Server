package org.sopt.kakaopay.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.kakaopay.service.BookmarkService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/bookmark")
public class BookmarkController {
    private final BookmarkService bookmarkService;
}
