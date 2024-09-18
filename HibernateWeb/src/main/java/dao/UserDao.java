package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User;

public class UserDao {
	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();

	public void insertOrUpdateUser(User u) {
		session.saveOrUpdate(u);
		tx.commit();
		session.close();
		sf.close();
	}
	
	public User getUserByid(int id) {
	 	User u = session.get(User.class, id);
	 	return u;
	}
	
	public void deleteUser(int id) {
		User u = session.get(User.class, id);
		session.delete(u);
	}
	
	public User loginUser(User u) {
//		String hql = "from User u u.email=:email and u.password=:password";
		String hql  ="from User";
		Query q = session.createQuery(hql);
//		List<User> list =  q.list();
		User u1 = (User)q.list().get(0);
		return u1; 
	}
	
}
