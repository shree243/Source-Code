package com.shree.repository;

import com.shree.domain.WithdrawalStatus;
import com.shree.model.Withdrawal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WithdrawalRepository extends JpaRepository<Withdrawal, Long> {
    List<Withdrawal> findByUserId(Long userId);
}
