package com.shree.repository;

import com.shree.domain.WalletTransactionType;
import com.shree.model.Wallet;
import com.shree.model.WalletTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WalletTransactionRepository extends JpaRepository<WalletTransaction, Long> {

    List<WalletTransaction> findByWalletOrderByDateDesc(Wallet wallet);

}
