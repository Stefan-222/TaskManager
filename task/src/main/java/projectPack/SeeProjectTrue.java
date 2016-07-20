package projectPack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SeeProjectTrue extends HttpServlet {
 static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		
		if(session.getAttribute("firstname")!=null)
			
				{	req.setAttribute("firstname", req.getParameter("firstname"));
				req.getRequestDispatcher("jsp/project/SeeProjectTrue.jsp").forward(req, resp);		
	
					}
			
			else
				{	req.getRequestDispatcher("/jsp/login.jsp").forward(req, resp);	}
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("project").toString();
		HttpSession session = req.getSession(false);	
		session.setAttribute("title", name);
		
		req.getRequestDispatcher("jsp/project/SeeProjectTrue.jsp").forward(req, resp);		
		
	
	}
}

