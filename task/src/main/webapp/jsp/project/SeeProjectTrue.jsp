<html>
<head>
	<title>Projects</title>
	<style> <jsp:directive.include file="../css/style.jsp"/> </style>
	<%@ page import="java.util.List" %>
	<%@ page import="projectPack.SelectProject" %>
	<%@ page import="DAO.Project" %>
	<%@ page import="javax.servlet.ServletException" %>
	<%@ page import="javax.servlet.http.HttpServletRequest" %>
	<%@ page import="javax.servlet.http.HttpServletResponse" %>
	<%@ page import="javax.servlet.http.HttpSession" %>
</head>

<body>
<div id="page">
	<div id="header">
			 <h2>Hello <%= (String)session.getAttribute("firstname") %></h2>
   			  <h5>id sesion: <% out.print( session.getId()); %></h5>
	</div>
	
	<div id="meniu">
   			 <jsp:directive.include file="../menus/Meniu.jsp" />
	</div> 

	<div id="sec">
		<div id="secundar">
				 <jsp:directive.include file="../menus/MeniuProject.jsp" />	
		</div>
	
			
		<div id="create">
			
			<%	SelectProject ME = new SelectProject();
	      		System.out.println(ME.listEmployees());
	      		%>

		
		</div>
	</div>
</div>
</body>
</html>