package com.example.demo.model.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.test.Employee;
import com.example.demo.model.test.repo.EmployeeRepository;


@RestController
public class EmployeeController {
	private EmployeeRepository er;
	
	public EmployeeController(EmployeeRepository er) {
		this.er = er;
	}
	
	@GetMapping("/employees")
	List<Employee> all() {
		return er.findAll();
	}
	
	@GetMapping("/employees/{id}")
	  Employee one(@PathVariable Long id) {

	    return er.findById(id)
	      .orElseThrow(() -> new RuntimeException());
	  }
}
