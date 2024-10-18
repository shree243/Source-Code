package com.shree.repository;

import com.shree.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {

    public Wallet findByUserId(Long userId);

}
