package com.example.demo.model.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String email;
	
	public Employee() {}
	
	public Employee(String name) {
		this.name = name;
	}
	
	@OneToOne(mappedBy="employee")
	@JsonManagedReference
	private EmployeeProfile profile;
	
}
