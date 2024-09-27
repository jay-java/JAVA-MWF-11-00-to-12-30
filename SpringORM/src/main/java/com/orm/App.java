package com.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/orm/config.xml");
		UserDao dao  =(UserDao)con.getBean("dao");
		
//		User u = new User();
//		u.setId(2);
//		u.setName("python");
//		u.setContact(976543987);
//		u.setAddress("mumbai");
//		
//		dao.insertUserOrUpdate(u);
		
		
//		User u = dao.getUserByid(1);
//		System.out.println(u);
		
		
		List<User> list = dao.getAllUser();
		System.out.println(list);
	}
}
