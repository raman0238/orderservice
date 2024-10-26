package com.example.orderservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity(name = "order")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    @GeneratedValue
    @Id
    int orderid;
    int amount;
    List<String> items;
}
