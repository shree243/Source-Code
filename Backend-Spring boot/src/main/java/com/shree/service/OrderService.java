package com.shree.service;

import com.shree.domain.OrderType;
import com.shree.model.Coin;
import com.shree.model.Order;
import com.shree.model.OrderItem;
import com.shree.model.User;
import com.shree.request.CreateOrderRequest;

import java.util.List;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId);

    List<Order> getAllOrdersForUser(Long userId, String orderType, String assetSymbol);

    void cancelOrder(Long orderId);

    // Order buyAsset(CreateOrderRequest req, Long userId, String jwt) throws
    // Exception;

    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;

    // Order sellAsset(CreateOrderRequest req,Long userId,String jwt) throws
    // Exception;

}
