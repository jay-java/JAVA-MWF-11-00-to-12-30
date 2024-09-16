package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		StudentD s1 = new StudentD();
		s1.setId(1);
		s1.setName("ayush");
		s1.setContact(987654);
		
		StudentD s2 = new StudentD();
		s2.setId(2);
		s2.setName("anajli");
		s2.setContact(987654);
		
		Course c1 =new Course();
		c1.setId(1);
		c1.setCourse_name("java");
		c1.setFees(2000);

		Course c2 =new Course();
		c2.setId(2);
		c2.setCourse_name("flutter");
		c2.setFees(3000);
		
		List<StudentD> stu_list = new ArrayList<StudentD>();
		stu_list.add(s1);
		stu_list.add(s2);
		
		List<Course> cour_list = new ArrayList<Course>();
		cour_list.add(c1);
		cour_list.add(c2);
		
		s1.setCourse_list(cour_list);
		s2.setCourse_list(cour_list);
		
		c1.setStu_list(stu_list);
		c2.setStu_list(stu_list);
		
		session.save(s1);
		session.save(s2);
		session.save(c1);
		session.save(c2);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
