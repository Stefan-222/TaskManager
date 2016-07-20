package projectPack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import DAO.Project;


public class DeleteProjectFct {
  
	private static SessionFactory sessionFactory;
	
    public static void delete(Integer id) {
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
    			Project project =  (Project)session.get(Project.class, id); 
    			session.delete(project); 
    			tx.commit();
    		}catch (HibernateException e) {
    			if (tx!=null) tx.rollback();
    			e.printStackTrace(); 
    		 }finally {
    			 session.close(); 
    		  }
      }
    //*****************************************************
    
    public static int deleteTProject(String title) {
    	try{
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();	
			}catch (Throwable ex) { 
				System.err.println("Failed to create sessionFactory object." + ex);
				throw new ExceptionInInitializerError(ex); 
			}

	Session session = sessionFactory.openSession();
	Transaction tx = null;
	

	//ArrayList project = new ArrayList<Project>();
	int project= 1;
  	try{	
  			tx = session.beginTransaction();
  			List projects = session.createQuery("FROM Project").list();    
  			for (Iterator iterator =  projects.iterator(); iterator.hasNext();){			
  				    Project proj = (Project) iterator.next();   
  				    if(title.equals(proj.getTitle())){
  					project =    proj.getIdProject(); 
  					System.out.println("the id project is: " + proj.getIdProject()); }
  		} 
     
     tx.commit();

  }catch (HibernateException e) {
     if (tx!=null) tx.rollback();
     e.printStackTrace(); 
  }finally {
     session.close(); 
  }
return project;
 
}
    
}