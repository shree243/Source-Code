package com.shree.request;

import com.shree.domain.OrderType;

import com.shree.model.Coin;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}
