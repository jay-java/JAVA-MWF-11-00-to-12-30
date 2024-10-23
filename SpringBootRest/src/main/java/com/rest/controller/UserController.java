package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.User;
import com.rest.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	@ResponseBody
	public String getData() {
		return "hello user";
	}
	
//	@GetMapping
//	@RequestMapping("/users")
//	@ResponseBody
//	public List<User> getAllUser(){
//		return this.userService.getAllUsers();
//	}
	@GetMapping("/users")
	public List<User> getAllUser(){
		return this.userService.getAllUsers();
	}
}
