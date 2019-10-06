package com.example.demo.model.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.test.Book;
import com.example.demo.model.test.repo.BookRepository;

@RestController
public class BookController {

	private BookRepository br;
	
	BookController(BookRepository br) {
		this.br = br;
	}
	
	@GetMapping("/books")
	List<Book> all() {
		return br.findAll();
	}
	
	@GetMapping("/books/{id}")
	  Book one(@PathVariable Long id) {

	    return br.findById(id)
	      .orElseThrow(() -> new RuntimeException());
	  }
}
