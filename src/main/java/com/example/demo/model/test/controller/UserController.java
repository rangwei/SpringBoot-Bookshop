package com.example.demo.model.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.test.User;
import com.example.demo.model.test.repo.UserRepository;

@RestController
public class UserController {
	
	private UserRepository ur;
	
	public UserController(UserRepository ur) {
		this.ur = ur;
	}
	
	@GetMapping("/users")
	List<User> all() {
		return ur.findAll();
	}
	
	@GetMapping("/users/{id}")
	  User one(@PathVariable Long id) {

	    return ur.findById(id)
	      .orElseThrow(() -> new RuntimeException());
	  }

}
