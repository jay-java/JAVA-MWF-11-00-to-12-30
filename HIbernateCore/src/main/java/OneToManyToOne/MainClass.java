package OneToManyToOne;

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
		
		StudentData s1 = new StudentData();
		s1.setId(1);
		s1.setName("bhumika");
		s1.setContact(987654);
		
		AddressData a1 = new AddressData();
		a1.setId(1);
		a1.setHno(12);
		a1.setCity("ahmedabad");
		
		AddressData a2 = new AddressData();
		a2.setId(2);
		a2.setHno(14);
		a2.setCity("delhi");
		
		List<AddressData> list = new ArrayList<AddressData>();
		list.add(a1);
		list.add(a2);
		
		s1.setAddress(list);
		a1.setStudent(s1);
		a2.setStudent(s1);
		
		session.save(s1);
		session.save(a1);
		session.save(a2);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
