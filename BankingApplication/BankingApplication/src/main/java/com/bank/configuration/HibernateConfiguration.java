package com.bank.configuration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.bank.model.UserInfo;


public class HibernateConfiguration {
	
	private static final Log LOGGER = LogFactory.getLog(HibernateConfiguration.class);
	private static SessionFactory sessionFactory;
	
	static {
		try {
			Configuration configuration= new Configuration();
			configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/subbu");
			configuration.setProperty("hibernate.connection.username", "root");
			configuration.setProperty("hibernate.connection.password", "root");
			configuration.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
			configuration.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");	
			configuration.setProperty("show_sql", "true");	
			
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
			sessionFactory = configuration.addPackage("com.bank.model.*").addAnnotatedClass(UserInfo.class).buildSessionFactory(builder.build());
		} catch (Exception ex) {
			LOGGER.error("Exception Occured While Configuring the Hibernate Properties" + ex);
		}
	}
	public static Session getSession() throws HibernateException {
		return sessionFactory.openSession();
	}

}
