package com.ssh.base;

import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ssh.domain.User;

public class UserDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean save(User user) {
		try {
			Configuration config = new Configuration().configure();
			sessionFactory = config.buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			System.out.println("ProductDao.save()...");
			session.save(user);
			session.getTransaction().commit();
			session.close();
			sessionFactory.close();
			return true;
		} catch (Exception e) {
			Logger.getGlobal().info(e.getMessage());
			return false;
		}

	}
}
