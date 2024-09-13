package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		//to save data
//		User u = new User(2, "python", 9865321, "ahmebdad");
//		session.save(u);
		
		//to fetch data
//		User u = session.get(User.class, 1);
//		System.out.println(u);
		
		//to update data
//		User u = new User(1, "java", 98764321, "delhi");
//		session.update(u);
		
		//to delete data
		User u = session.get(User.class, 1);
		session.delete(u);
		
		tx.commit();
		session.close();
		sf.close();
		
		
	}
}
