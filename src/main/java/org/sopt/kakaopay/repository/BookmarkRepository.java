package org.sopt.kakaopay.repository;

import org.sopt.kakaopay.domain.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
}
