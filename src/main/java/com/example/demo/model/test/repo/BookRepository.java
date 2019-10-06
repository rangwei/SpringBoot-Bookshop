package com.example.demo.model.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.test.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
