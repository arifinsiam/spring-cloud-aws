package com.example.aws.lambda.repository;

import com.example.aws.lambda.domain.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {
    public List<Order> buildOrders(){
        return Stream.of(
                new Order(101, "Mobile", 15000, 1),
                new Order(102, "Book", 15000, 2),
                new Order(103, "Book", 15000, 3),
                new Order(104, "Pant", 1000, 1)
        ).collect(Collectors.toList());
    }
}
