package com.example.orderservice.service;

import com.example.orderservice.dao.OrderRepository;
import com.example.orderservice.model.Order;
import org.hibernate.annotations.SecondaryRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OderService {

    @Autowired
    OrderRepository orderRepository;
    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    public void addOrder(Order order) {
        orderRepository.save(order);
    }
}
