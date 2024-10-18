package com.shree.service;

import com.shree.domain.VerificationType;
import com.shree.model.ForgotPasswordToken;
import com.shree.model.User;

public interface ForgotPasswordService {

    ForgotPasswordToken createToken(User user, String id, String otp,
            VerificationType verificationType, String sendTo);

    ForgotPasswordToken findById(String id);

    ForgotPasswordToken findByUser(Long userId);

    void deleteToken(ForgotPasswordToken token);

    boolean verifyToken(ForgotPasswordToken token, String otp);
}
