package com.example.demo.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.test.Author;
import com.example.demo.model.test.Book;
import com.example.demo.model.test.BookOrder;
import com.example.demo.model.test.Employee;
import com.example.demo.model.test.EmployeeProfile;
import com.example.demo.model.test.OrderItem;
import com.example.demo.model.test.User;
import com.example.demo.model.test.repo.AuthorRepository;
import com.example.demo.model.test.repo.BookOrderRepository;
import com.example.demo.model.test.repo.BookRepository;
import com.example.demo.model.test.repo.EmployeeProfileRepository;
import com.example.demo.model.test.repo.EmployeeRepository;
import com.example.demo.model.test.repo.OrderItemRepository;
import com.example.demo.model.test.repo.UserRepository;

@SpringBootApplication
public class Demo1Application {

	private static final Logger log = LoggerFactory.getLogger(Demo1Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(UserRepository ur) {
		return (args) -> {
			ur.save(new User("a"));
			ur.save(new User("b"));
			ur.save(new User("c"));
			ur.save(new User("d"));
		};
	}
	
	@Bean
	public CommandLineRunner demo1(EmployeeRepository er, EmployeeProfileRepository epr) {
		return (args) -> {

			
			Employee e = new Employee("Jack");
			e = er.save(e);
			
			EmployeeProfile ep = new EmployeeProfile();
			ep.setAddress("address");
			ep.setAge(10);
			
			ep.setEmployee(e);
			ep = epr.save(ep);

			Employee e2 = new Employee("Andy");
			er.save(e2);
			
		};
	}
	
	@Bean
	public CommandLineRunner demo2(UserRepository ur, BookRepository br, AuthorRepository ar, BookOrderRepository bor, OrderItemRepository oir) {
		return (args) -> {
			
			User u = new User("testuser");
			u = ur.save(u);
			
			Book b = new Book("Book1");
			
			Author a = new Author("AAA");
			
			a = ar.save(a);
			b.setAuthor(a);
			
			br.save(b);
			
			Book c = new Book("Book2");
			c.setAuthor(a);
			br.save(c);
			
			Author a1 =new Author("BBB");
			ar.save(a1);
			

			
			BookOrder order1 = new BookOrder();
			order1.setUser(u);
			order1 = bor.save(order1);
			
			OrderItem item1 = new OrderItem();
			item1.setBook(b);
			item1.setNumber(1);
			item1.setOrder(order1);
			
			OrderItem item2 = new OrderItem();
			item2.setOrder(order1);
			
			oir.save(item1);
			oir.save(item2);
			
			
		};
	}
	
	

}
