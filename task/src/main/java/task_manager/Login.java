package task_manager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
  
		 HttpSession session = req.getSession(false);
		 session.setAttribute("firstname", firstName);
		//  if(session!=null)
		
		if (!Check.validate(firstName, password)){
				// not correct go back to login
					doGet(req, resp);	} 
		
		else {
			// correct!
			session.setAttribute("firstname", firstName);
			req.setAttribute("firstname", firstName);
			req.getRequestDispatcher("/Greeting").forward(req, resp);	}
	}

}
