package org.sopt.kakaopay.repository;

import java.util.Optional;
import org.sopt.kakaopay.domain.Bookmark;
import org.sopt.kakaopay.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    Optional<Bookmark> findBySourceMemberAndTargetMember(Member sourceMember, Member targetMemberTarget);
}
