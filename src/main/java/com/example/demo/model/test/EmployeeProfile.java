package com.example.demo.model.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;


@Entity
@Data
public class EmployeeProfile {

	public EmployeeProfile() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private int age;
	
	private String gender;
	
	private String address;
	
	@OneToOne
	@JsonBackReference
	private Employee employee;
}
