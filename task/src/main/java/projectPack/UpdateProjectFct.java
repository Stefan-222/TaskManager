package projectPack;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import DAO.Project;

public class UpdateProjectFct {
	
private static SessionFactory sessionFactory;
	
    public static void update(Integer id, String title, String description) {
    	try{
    		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	}catch (Throwable ex) { 
    		System.err.println("Failed to create sessionFactory object." + ex);
    		throw new ExceptionInInitializerError(ex); 
         }

    	Session session = sessionFactory.openSession();
	
    	
    	Transaction tx = null;
		try{
			 tx = session.beginTransaction();
	         Project editedProject = 
	                    (Project)session.get(Project.class, id); 
	         editedProject.setTitle( title );
	         editedProject.setDescription( description );
			 session.update(editedProject); 
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		 }finally {
			 session.close(); 
		  }
  }
    	
	

		

}
