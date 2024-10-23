package com.jsp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.model.User;
import com.jsp.repo.UserRepository;

@Component
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public User saveUser(User u) {
		return this.repo.save(u);
	}
	
	public List<User> getAllUser(){
		return this.repo.findAll();
	}
	
	public User updateUser(User u) {
		return this.repo.save(u);
	}
	
	public void deleteUser(int id) {
		this.repo.deleteById(id);
	}
	
	
	
}
