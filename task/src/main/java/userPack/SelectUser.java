package userPack;

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

public class SelectUser {
private static SessionFactory sessionFactory;
	
    public static List<User> select() {
    		try{
    			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    		}catch (Throwable ex) { 
    			System.err.println("Failed to create sessionFactory object." + ex);
    			throw new ExceptionInInitializerError(ex); 
    		}

    	Session session = sessionFactory.openSession();
    	   
    	Transaction tx = null;
    	

    	ArrayList listUsers = new ArrayList<User>();
      	try{
    	
      			tx = session.beginTransaction();
     
      			List users = session.createQuery("FROM User").list(); 
         
      			for (Iterator iterator =  users.iterator(); iterator.hasNext();){
      			
      				    User user = (User) iterator.next(); 
            
      		
      					listUsers.add(user);  
            
      					System.out.println("Name: " + user.getUser()); 
      		} 
         
         tx.commit();
   
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
	return listUsers;
    }
}
