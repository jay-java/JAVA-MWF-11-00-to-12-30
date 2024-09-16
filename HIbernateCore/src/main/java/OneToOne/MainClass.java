package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("bhumika");
		s1.setContact(987654);
		
		Address a1 = new Address();
		a1.setAid(1);
		a1.setHno(12);
		a1.setCity("ahmedabad");
		
		s1.setAddress(a1);
		a1.setStudent(s1);
		
		session.save(s1);
		session.save(a1);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
