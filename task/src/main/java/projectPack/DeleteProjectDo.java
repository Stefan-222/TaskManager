package projectPack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import projectPack.DeleteProjectFct;


public class DeleteProjectDo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session.getAttribute("firstname")!=null)
			
				{	req.setAttribute("firstname", req.getParameter("firstname"));
					req.getRequestDispatcher("/jsp/proiect/DeleteProject.jsp").forward(req, resp);	
					}
			
			else
				{	req.getRequestDispatcher("/jsp/login.jsp").forward(req, resp);	}
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	//	String id = req.getParameter("id").toString();
		//Integer idu= Integer.parseInt(id);
		//DeleteProjectFct.delete(idu);
		//DeleteProjectFct q = new DeleteProjectFct();
	//	q.deleteProje(idu);
	
		
		String title = req.getParameter("title").toString();
		DeleteProjectFct.delete(DeleteProjectFct.deleteTProject(title));
		req.getRequestDispatcher("/jsp/project/DeleteProject.jsp").forward(req, resp);
	}

}
