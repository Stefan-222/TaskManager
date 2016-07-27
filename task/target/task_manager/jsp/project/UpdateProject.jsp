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
			<form action="http://localhost:8080/task/UpdateProjectTrue" method=POST>
			<br>
			<br>
					<label>Select project</label> 
					 <select name="projectEdit">
					 <% List <Project> mList = SelectProject.select();  %>
					 <%		for(int i=0;i<mList.size();i++){	
								 Project project = (Project)SelectProject.select().get(i); 
					 %>
				          <option value= <%= project.getIdProject() %> ><%= project.getTitle() %></option>
 				      <% } %>    
				          </select>
				     <br>
				     <br>
				     <input type="submit" name="submit" value="Edit">
			</form>
			
		
		
		
	      		
		</div>
	</div>
</div>
</body>
</html>