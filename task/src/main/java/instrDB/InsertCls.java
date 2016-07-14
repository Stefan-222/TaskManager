package instrDB;

import java.util.Iterator;
import java.util.List;

import javax.management.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import DAO.User;

public class InsertCls {

	private static SessionFactory sessionFactory;

	public static void main(String[] args) {
		try {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml")
					.buildSessionFactory();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Session session = sessionFactory.openSession();

		

		//Inserting Student Records
		Transaction tx = session.beginTransaction();
		User user = new User();
		user.setUser("tyuu");
		user.setPassword("09876");
		session.save(user);
		tx.commit();

		System.out.println("Inserted Student details");
	}
}