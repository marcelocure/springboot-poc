package com.github.marcelocure.springbootpoc.v1.service;

import com.github.marcelocure.springbootpoc.v1.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public Order buildOrder(){
        return new Order("123", 123F, "customerName", "BR");
    }
}
