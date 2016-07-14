package projectPack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import DAO.Project;

public class InsertProject {

	private static SessionFactory sessionFactory;

	public static void create(String titlu, String descriere) {
		try {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml")
					.buildSessionFactory();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Session session = sessionFactory.openSession();

		

		//Inserting Student Records
		Transaction tx = session.beginTransaction();
		Project project = new Project();
		project.setTitle(titlu);
		project.setDescription(descriere);
		project.setIdProjectRelease(1);
		project.setIdProjectUser(5);
		session.save(project);
		tx.commit();

		System.out.println("Inserted Student details");
	}
}