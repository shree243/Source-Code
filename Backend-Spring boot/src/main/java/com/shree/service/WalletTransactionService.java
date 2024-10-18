package com.shree.service;

import com.shree.domain.WalletTransactionType;
import com.shree.model.Wallet;
import com.shree.model.WalletTransaction;

import java.util.List;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
            WalletTransactionType type,
            String transferId,
            String purpose,
            Long amount);

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);

}
