package com.github.marcelocure.springbootpoc.v1.contract;

import com.github.marcelocure.springbootpoc.v1.model.Order;
import com.github.marcelocure.springbootpoc.v1.service.OrderService;

import java.util.List;

public interface IOrder {
    OrderService orderService = null;
    List<Order> getOrders();
    Order getOrder(String id);
}
