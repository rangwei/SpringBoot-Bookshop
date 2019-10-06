package com.example.demo.model.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.test.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
