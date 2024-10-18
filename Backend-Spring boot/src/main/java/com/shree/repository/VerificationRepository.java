package com.shree.repository;

import com.shree.model.VerificationCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationRepository extends JpaRepository<VerificationCode, Long> {
    VerificationCode findByUserId(Long userId);
}
