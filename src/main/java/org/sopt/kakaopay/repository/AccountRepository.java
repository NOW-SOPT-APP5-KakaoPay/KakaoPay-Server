package org.sopt.kakaopay.repository;

import org.sopt.kakaopay.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
