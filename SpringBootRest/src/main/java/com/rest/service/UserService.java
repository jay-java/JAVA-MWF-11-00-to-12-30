package com.rest.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rest.model.User;
import com.rest.repo.UserRepo;

@Component
public class UserService {

	@Autowired
	private UserRepo repo;
	
	public List<User> getAllUsers(){
		return repo.findAll();
	}
	
	public User saveUser(User u) {
		return this.repo.save(u);
	}
	
	public Optional<User> getUserById(int id) {
		return this.repo.findById(id);
	}
	
	public User updateUser(User u) {
		return this.repo.save(u);
	}
	
	public void deleteUser(int id) {
		this.repo.deleteById(id);
	}
}
