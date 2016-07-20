package instrDB_Test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import DAO.User;


public class SelectCls {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      try{
         factory = new Configuration().configure().buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }

      SelectCls ME = new SelectCls();

      ME.listEmployees();
   }

   /* Method to  READ all the employees */
   public void listEmployees(){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
     
        List employees = session.createQuery("FROM User").list(); 
         
         for (Iterator iterator = 
               employees.iterator(); iterator.hasNext();){
            User employee = (User) iterator.next(); 
            
            
            System.out.println("Name: " + employee.getUser()+"   Parola: " + employee.getPassword()+ "  Role  " + employee.getIdRolUser()); 
          
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
	
     
   }
   
}