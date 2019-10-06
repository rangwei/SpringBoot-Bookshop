package com.example.demo.model.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.test.EmployeeProfile;
import com.example.demo.model.test.repo.EmployeeProfileRepository;

@RestController
public class EmployeeProfileController {

	private EmployeeProfileRepository epr;
	
	public EmployeeProfileController(EmployeeProfileRepository epr) {
		this.epr = epr;
	}
	
	@GetMapping("/employeeprofiles")
	List<EmployeeProfile> all() {
		return epr.findAll();
	}
	
	@GetMapping("/employeeprofiles/{id}")
	EmployeeProfile one(@PathVariable Long id) {

	    return epr.findById(id)
	      .orElseThrow(() -> new RuntimeException());
	  }
}
