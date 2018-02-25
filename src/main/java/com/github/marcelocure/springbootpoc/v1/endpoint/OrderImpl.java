package com.github.marcelocure.springbootpoc.v1.endpoint;

import com.github.marcelocure.springbootpoc.v1.contract.IOrder;
import com.github.marcelocure.springbootpoc.v1.model.Order;
import com.github.marcelocure.springbootpoc.v1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class OrderImpl implements IOrder {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/v1/orders", method = GET)
    public List<Order> getOrders() {
        return Arrays.asList(orderService.buildOrder(),orderService.buildOrder());
    }

    @RequestMapping(value = "/v1/orders/{id}", method = GET)
    public Order getOrder(String id) {
        return orderService.buildOrder();
    }
}
