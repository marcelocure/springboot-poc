package com.github.marcelocure.springbootpoc.service;

import com.github.marcelocure.springbootpoc.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public Order buildOrder(){
        return new Order("123", 123F, "customerName");
    }
}
