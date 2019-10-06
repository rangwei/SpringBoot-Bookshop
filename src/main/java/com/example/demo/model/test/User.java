package com.example.demo.model.test;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	public User() {}
	
	public User(String name) {
		this.name = name;
	}
	
	@OneToMany(mappedBy = "user")
	@JsonManagedReference
	private List<BookOrder> orders;
	
}
