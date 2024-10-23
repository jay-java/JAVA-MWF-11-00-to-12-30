package com.rest.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rest.model.User;
import com.rest.repo.UserRepo;

@Component
public class UserService {

	@Autowired
	private UserRepo repo;
	
	public List<User> getAllUsers(){
		User u1 = new User(1, "java", "ahmedabad", 987654231);
		User u2 = new User(2, "python", "ahmedabad", 987654231);
		User u3 = new User(3, "php", "ahmedabad", 987654231);
		User u4 = new User(4, "node", "ahmedabad", 987654231);
		
		return Arrays.asList(u1,u2,u3,u4);
	}
}
