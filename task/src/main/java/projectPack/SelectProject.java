package projectPack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import DAO.Project;
import DAO.User;


public class SelectProject{
   private static SessionFactory factory; 
   public static void main(String[] args) {
      try{
         factory = new Configuration().configure().buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      SelectProject ME = new SelectProject();
		System.out.println(ME.listEmployees()); 
      	
   }

   /* Method to  READ all the employees */
   public List<Project> listEmployees(){
	   SessionFactory factory; 
	   factory = new Configuration().configure().buildSessionFactory();
      Session session = factory.openSession();
      Transaction tx = null;
      ArrayList project = new ArrayList<Project>();
      try{
    	
         tx = session.beginTransaction();
     
        List projects = session.createQuery("FROM Project").list(); 
         
         for (Iterator iterator = 
               projects.iterator(); iterator.hasNext();){
            Project proj = (Project) iterator.next(); 
            int index = 0;
			project.add(index, proj);
   //         project.add(proj);  
            System.out.println("Name: " + proj.getTitle()); 
         } 
         
         tx.commit();
         return project;
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
	return project;
     
   }
   
   
   
   
   
}