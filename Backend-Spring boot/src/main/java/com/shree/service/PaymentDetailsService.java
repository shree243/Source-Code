package com.shree.service;

import com.shree.model.PaymentDetails;
import com.shree.model.User;
import jakarta.persistence.OneToOne;

public interface PaymentDetailsService {
    public PaymentDetails addPaymentDetails(String accountNumber,
            String accountHolderName,
            String ifsc,
            String bankName,
            User user);

    public PaymentDetails getUsersPaymentDetails(User user);

}
