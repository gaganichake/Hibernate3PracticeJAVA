package com.hibernatepractice.service;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernatepractice.domain.User;
import com.hibernatepractice.util.HibernateUtil;

public class UserService {

	public static void main(String[] args) {
		System.out.println(8*2/4);
	}
	
	public void createUsers() {

		// Opening of Hibernate session
		Session session = HibernateUtil.getSessionFactory().openSession();

		// Beginning of a transaction
		Transaction tx = session.beginTransaction();

		// Formation of a user
		User u = new User();
		u.setName("John");
		u.setSurname("Smith");

		// Saving the user in a database
		session.save(u);

		// Confirmation of the transaction
		tx.commit();

		// Closure of the Hibernate session
		session.close();

	}

	public void displayUsers() {

		// Opening of the Hibernate session
		Session session = HibernateUtil.getSessionFactory().openSession();

		// Beginning of a transaction
		Transaction tx = session.beginTransaction();

		// Formation a SQL query concerning a list of users to a base
		Criteria criteria = session.createCriteria(User.class);

		// Execution of the SQL query
		List users = criteria.list();

		// Iterating after a result of the SQL query
		for (Iterator it = users.iterator(); it.hasNext();) {
			User user = (User) it.next();
			System.out.println(user);
		}
		// Confirmation of the transaction
		tx.commit();

		// Closure of the Hibernate session
		session.close();
	}
}