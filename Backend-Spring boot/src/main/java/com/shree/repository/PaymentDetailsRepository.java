package com.shree.repository;

import com.shree.model.PaymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails, Long> {

    PaymentDetails getPaymentDetailsByUserId(Long userId);
}
