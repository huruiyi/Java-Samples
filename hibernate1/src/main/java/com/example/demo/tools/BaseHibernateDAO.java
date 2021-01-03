package com.example.demo.tools;

import org.hibernate.Session;

public class BaseHibernateDAO implements IBaseHibernateDAO {

	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}

}