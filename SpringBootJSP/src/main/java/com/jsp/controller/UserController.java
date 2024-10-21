package com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.model.User;
import com.jsp.services.UserService;
@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping("/register")
	public String registerUser(@ModelAttribute User u) {
		this.service.saveUser(u);
		return "home";
	}
	
	
	
}
