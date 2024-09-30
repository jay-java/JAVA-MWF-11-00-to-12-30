package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.UserDao;
import com.model.User;

@Controller
public class UserController {

//	@RequestMapping("/")
//	public String indexPage(HttpServletRequest request) {
//		request.setAttribute("contact", 987654321);
//		request.setAttribute("name", "JAVA");
//		List list = new ArrayList();
//		list.add(1);
//		list.add("java");
//		list.add(1234.34);
//		list.add(false);
//		list.add('d');
//		list.add(2343423);
//		list.add("python");
//		request.setAttribute("list", list);
//		return "index";
//	}
	
	@RequestMapping("/")
	public String indexPage(Model m) {
		m.addAttribute("contact", 987654321);
		m.addAttribute("name", "JAVA");
		List list = new ArrayList();
		list.add(1);
		list.add("java");
		list.add(1234.34);
		list.add(false);
		list.add('d');
		list.add(2343423);
		list.add("python");
		m.addAttribute("list", list);
		return "index";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
//	@RequestMapping("/register")
//	public void registerUser(HttpServletRequest request) {
//		User u = new User();
//		u.setName(request.getParameter("name"));
//		u.setContact(Long.parseLong(request.getParameter("contact")));
//		System.out.println(u);
//	}
	
//	@RequestMapping("/register")
//	public void registerUser(
//			@RequestParam("name") String name,
//			@RequestParam("contact") long contact,
//			@RequestParam("address") String address) {
//		System.out.println(name + contact + address);
//	}
	
	@Autowired
	private UserDao dao;
	
	@RequestMapping("/register")
	public void registerUser(@ModelAttribute User u) {
		System.out.println(u);
		this.dao.insertOrUpdateUser(u);
	}
}
