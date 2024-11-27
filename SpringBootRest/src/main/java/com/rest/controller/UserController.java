package com.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.User;
import com.rest.service.UserService;

@RestController
@RequestMapping("/users")
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
	
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable("id") int id) {
		return this.userService.getUserById(id);
	}
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User u) {
		System.out.println("add user called");
		return this.userService.saveUser(u);
	}
	
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User u) {
		return this.userService.updateUser(u);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		this.userService.deleteUser(id);
	}
	
	@PostMapping("/addProduct")
	public String postMethodName(@RequestBody String entity) {
		//TODO: process POST request
		
		return entity;
	}
	
	
}
