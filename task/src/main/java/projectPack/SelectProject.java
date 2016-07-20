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

	private static SessionFactory sessionFactory;
	
    public static List<Project> select() {
    		try{
    			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    		}catch (Throwable ex) { 
    			System.err.println("Failed to create sessionFactory object." + ex);
    			throw new ExceptionInInitializerError(ex); 
    		}

    	Session session = sessionFactory.openSession();
    	   
    	Transaction tx = null;
    	

    	ArrayList project = new ArrayList<Project>();
      	try{
    	
      			tx = session.beginTransaction();
     
      			List projects = session.createQuery("FROM Project").list(); 
         
      			for (Iterator iterator =  projects.iterator(); iterator.hasNext();){
      			
      				    Project proj = (Project) iterator.next(); 
            
      		
      					project.add(proj);  
            
      					System.out.println("Name: " + proj.getTitle()); 
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
    
    //******************************************************
    public static int select1Proj(String title) {
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
  					System.out.println("Id proj este: " + proj.getTitle()); }
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
    
    
    
    public static int selectIsID(int Id) {
  		try{
  			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();	
  			}catch (Throwable ex) { 
  				System.err.println("Failed to create sessionFactory object." + ex);
  				throw new ExceptionInInitializerError(ex); 
  			}

  	Session session = sessionFactory.openSession();
  	Transaction tx = null;
  	

  	//ArrayList project = new ArrayList<Project>();
  	int project= 0;
    	try{	
    			tx = session.beginTransaction();
    			List projects = session.createQuery("FROM Project").list();    
    			for (Iterator iterator =  projects.iterator(); iterator.hasNext();){			
    				    Project proj = (Project) iterator.next();    
    				    if(Id==proj.getIdProject()){
    					project =    proj.getIdProject(); 
    					System.out.println("Id proj este: " + proj.getIdProject()); }
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