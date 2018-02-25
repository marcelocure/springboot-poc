package com.github.marcelocure.springbootpoc.controller;

import com.github.marcelocure.springbootpoc.model.Order;
import com.github.marcelocure.springbootpoc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/hello", method = GET)
    public Order getOrder() {
        return orderService.buildOrder();
    }
}
