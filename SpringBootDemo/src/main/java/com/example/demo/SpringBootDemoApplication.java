package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.User;
import com.example.repo.UserRepository;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		UserRepository repo = (UserRepository) SpringApplication.run(UserRepository.class, args);
		
		User u1 = new User("java", 987654, "java@gmail.com", "java123");
		repo.save(u1);
	}

}
