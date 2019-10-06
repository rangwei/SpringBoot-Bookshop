package com.example.demo.model.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.test.BookOrder;

public interface BookOrderRepository extends JpaRepository<BookOrder, Long>{

}