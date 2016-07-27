package projectPack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UpdateProjectDo extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session = req.getSession(false);
		
		if(session.getAttribute("firstname")!=null)
			
				{   req.setAttribute("firstname", req.getParameter("firstname"));
					req.getRequestDispatcher("/jsp/project/UpdateProject.jsp").forward(req, resp);	
					}
			
			else
				{	req.getRequestDispatcher("/jsp/login.jsp").forward(req, resp);	}
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);

		String idu =  (String) session.getAttribute("idProj") ;
		String titl = req.getParameter("den").toString();
		String descr = req.getParameter("descr").toString();
		
		int y = Integer.parseInt(idu);
		UpdateProjectFct.update(y, titl, descr);
		
		
		session.setAttribute("idProj", null);
		
		req.getRequestDispatcher("/jsp/project/UpdateProject.jsp").forward(req, resp);	
	}

}
