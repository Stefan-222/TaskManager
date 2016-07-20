<html>
<head>
	<title>Project</title>
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
  		      <h3>Today's date: <%= (new java.util.Date()).toLocaleString()%></h3>
     		  <h2>Hello <%= (String)session.getAttribute("firstname") %></h2>
	</div>
	
	<div id="meniu">
   			 <jsp:directive.include file="../menus/Meniu.jsp" />
	</div> 

		<div id="sec">
				<div id="secundar">
					 <jsp:directive.include file="../menus/MeniuProject.jsp" />	
				</div>
	
			
				<div id="create">
			
					<%
			 		     String nume = (String)session.getAttribute("title") ;
		 		   		 out.print(SelectProject.select().get(SelectProject.select1Proj(nume)).getTitle());
	     	 		%>

		
				</div>
		</div>
</div>
</body>
</html>