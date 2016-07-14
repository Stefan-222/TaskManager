package DAO;
 
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Login extends HttpServlet {

	/**
	 * Default serial id
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/jsp/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Login logic
		String firstName = req.getParameter("firstname").toString();
		String password = req.getParameter("password").toString();
//**************************************************************************
	/*	String rez= null;
		
		 
		  
		SessionFactory factory; 
		         factory = new Configuration().configure().buildSessionFactory();

		      Session session = factory.openSession();
		      Transaction tx = null;
		        tx = session.beginTransaction();
		        List employees = session.createQuery("FROM User where user="+firstName).list();     
		         for (Iterator iterator = employees.iterator(); iterator.hasNext();)
		         {
		        		
		        	 	User employee = (User) iterator.next(); 
		        	 	System.out.println("First Name: " + employee.getUser()); 
		        	 	
		        	 	if (employee.getUser().equals(firstName) && employee.getPassword().equals(password)) {
		        	 		System.out.println("First Name: " + employee.getUser());
		        	 		req.setAttribute("firstname", firstName);
		        	 		req.getRequestDispatcher("/Greeting").forward(req, resp);	
		        	 		 tx.commit();session.close(); 
		        	 		}     
		         }
		         
		         System.out.println("Nu s-a gasit" );
		         doGet(req, resp);
     	 	
     
		         tx.commit();
		         session.close();
*/
		
//***************************************************************************
	/*	if (!"admin".equals(firstName) || !"pass".equals(password)) {
	    			// not correct
	    			// go back to login
	    			doGet(req, resp);
	    		} else {
	    			// correct! Greet!
	    			req.setAttribute("firstname", firstName);
	    			req.getRequestDispatcher("/Greeting").forward(req, resp);
	    		}
	  */
	         }
	  
	
}   
		
		
		
		
	


