package com.example.demo.model.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.test.Author;
import com.example.demo.model.test.repo.AuthorRepository;

@RestController
public class AuthorController {

	private AuthorRepository ar;
	
	public AuthorController(AuthorRepository ar) {
		this.ar = ar;
	}
	
	@GetMapping("/authors")
	List<Author> all() {
		return ar.findAll();
	}
	
	@GetMapping("/author/{id}")
	  Author one(@PathVariable Long id) {

	    return ar.findById(id)
	      .orElseThrow(() -> new RuntimeException());
	  }
}
