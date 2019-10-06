package com.example.demo.model.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.test.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{

}
