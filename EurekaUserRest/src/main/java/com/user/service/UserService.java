package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.user.model.User;
import com.user.repo.UserRepo;

@Component
public class UserService {

	@Autowired
	private UserRepo repo;
	
	public List<User> getAllUser(){
		return this.repo.findAll();
	}
}
