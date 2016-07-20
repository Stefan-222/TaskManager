<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

</head>
<body>
<c:forTokens items="Zara,nuha,roshy" delims="," var="name">
   <c:out value="${name}"/><p>
</c:forTokens>
</body>
</html>



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
			
			<%
				Integer i=new Integer(null);
			 	for( i=1;i<=10;i++){
			 	
					//if(SelectProject.selectIsID(i)!=0)
	    	  		out.print(SelectProject.select().get(i).getTitle()+SelectProject.select().get(i).getDescription()+"\n"); } %><br>
		
		
	      		
		</div>
	</div>
</div>
</body>
</html>