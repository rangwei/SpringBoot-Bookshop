package com.example.demo.model.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.test.BookOrder;
import com.example.demo.model.test.repo.BookOrderRepository;

@RestController
public class BookOrderController {
	
	private BookOrderRepository bor;
	
	public BookOrderController(BookOrderRepository bor) {
		this.bor = bor;
	}
	
	@GetMapping("/orders")
	List<BookOrder> all() {
		return bor.findAll();
	}
	
	@GetMapping("/orders/{id}")
	  BookOrder one(@PathVariable Long id) {

	    return bor.findById(id)
	      .orElseThrow(() -> new RuntimeException());
	  }

}
