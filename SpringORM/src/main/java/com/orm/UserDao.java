package com.orm;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class UserDao {

	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Transactional
	public void insertUserOrUpdate(User u) {
		this.hibernateTemplate.saveOrUpdate(u);
	}

	@Transactional
	public void deleteUser(User u) {
		this.hibernateTemplate.delete(u);
	}

	public User getUserByid(int id) {
		return this.hibernateTemplate.get(User.class, id);
	}

	public List<User> getAllUser() {
		return this.hibernateTemplate.loadAll(User.class);
	}

}
