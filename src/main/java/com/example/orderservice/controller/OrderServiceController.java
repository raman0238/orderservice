package com.example.orderservice.controller;

import com.example.orderservice.model.Order;
import com.example.orderservice.service.OderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderServiceController {
    @Autowired
    OderService orderService;

    @GetMapping("/order")
    public List<Order> getOrders(){
        return  orderService.getAllOrder();
    }

    @PostMapping("/order/add")
    public void addOder(@RequestBody Order order) {
        orderService.addOrder(order);
    }
}
