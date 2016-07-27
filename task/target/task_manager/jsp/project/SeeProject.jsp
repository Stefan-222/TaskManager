<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


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
			 <h2>Hello <%= (String)session.getAttribute("firstname") %></h2>
   			 <h3>Today's date: <%= (new java.util.Date()).toLocaleString()%></h3>
	</div>
	
	<div id="meniu">
   			 <jsp:directive.include file="../menus/Meniu.jsp" />
	</div> 

	<div id="sec">
		<div id="secundar">
				 <jsp:directive.include file="../menus/MeniuProject.jsp" />	
		</div>
	
		<div id="create">
			<form action="http://localhost:8080/task/SeeProjectTrue" method=POST>
			Project Name:<br> 
			<input type="text" name="project">
			<br> 
			<br> 
			<input type="submit" value="Search"> 
			</form>
			

			 <table border=3 cellpadding="3px">
				 <% List <Project> myList = SelectProject.select(); 	 %>
				 
				 <thead>
				 		<tr>
				 			<td>Nr. crt. </td>
				 			<td>Title</td>
				 			<td>Description</td>
				 			<td>Version</td>
				 			<td>User responsible</td>
				 		</tr>
				 </thead>
				 
				 
		<%		for(int i=0;i<myList.size();i++){
					
					Project proiect = (Project)SelectProject.select().get(i);  %>
					 <tr>
						
						  <td><%= i+1 	 %> </td>
					 	 <td><%= proiect.getTitle() 		 %> </td>
					 	 <td><%= proiect.getDescription() 	 %> </td> 
 			 	 		 <td><%= proiect.getRelease(proiect.getIdProjectRelease()) %>	 </td> 
 			 	 		 <td><%= proiect.getUser(proiect.getIdProjectUser()) %>	 </td>
 					</tr>
 				 	<% }   %>
			
				
			</table>
<br>

		</div>
	</div>
</div>
</body>
</html>





