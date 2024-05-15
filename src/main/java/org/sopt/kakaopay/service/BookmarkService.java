package org.sopt.kakaopay.service;

import lombok.RequiredArgsConstructor;
import org.sopt.kakaopay.repository.BookmarkRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository bookmarkRepository;
}
