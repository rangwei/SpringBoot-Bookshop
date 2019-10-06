package com.example.demo.model.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.test.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
