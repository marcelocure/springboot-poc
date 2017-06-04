package com.github.marcelocure.springbootpoc.controller;

import com.github.marcelocure.springbootpoc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService helloService;

    @RequestMapping("/")
    public String hello() {
        return helloService.doIt();
    }
}
