package org.sopt.kakaopay.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.kakaopay.common.dto.SuccessMessage;
import org.sopt.kakaopay.common.dto.SuccessStatusResponse;
import org.sopt.kakaopay.service.BookmarkService;
import org.sopt.kakaopay.service.dto.BookmarkDeleteDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/bookmark")
public class BookmarkController {
    private final BookmarkService bookmarkService;

    @DeleteMapping
    public ResponseEntity<SuccessStatusResponse> deleteBookmark(
            @RequestHeader("memberId") Long memberId,
            @RequestBody BookmarkDeleteDto bookmarkDeleteDto
    ) {
        bookmarkService.deleteBookmark(memberId, bookmarkDeleteDto);
        return ResponseEntity.status(HttpStatus.OK)
                .body(SuccessStatusResponse.of(SuccessMessage.BOOKMARK_DELETE_SUCCESS));
    }
}
