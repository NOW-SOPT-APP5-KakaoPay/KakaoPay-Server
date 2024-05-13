package org.sopt.kakaopay.repository;

import org.sopt.kakaopay.domain.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Long> {
}
