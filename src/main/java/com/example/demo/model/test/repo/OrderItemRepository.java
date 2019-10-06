package com.example.demo.model.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.test.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}