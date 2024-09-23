package com.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/orm/config.xml");
		UserDao dao  =(UserDao)con.getBean("dao");
		
		User u = new User();
		u.setId(1);
		u.setName("java");
		u.setContact(976543);
		u.setAddress("ahmedabad");
		
		dao.insertUserOrUpdate(u);
	}
}
