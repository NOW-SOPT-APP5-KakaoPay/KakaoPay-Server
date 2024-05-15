package org.sopt.kakaopay.repository;

import java.util.Optional;
import org.sopt.kakaopay.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByBankAndBankAccount(String bank, String bankAccount);
}
