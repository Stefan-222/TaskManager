<html>
<head>
	<title>Project</title>
	<style> <jsp:directive.include file="../css/style.jsp"/> </style>
	<%@ page import="java.util.List" %>
	<%@ page import="userPack.SelectUser" %>
	<%@ page import="DAO.User" %>
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
   			 <jsp:directive.include file="../menus/Meniu.jsp"/>
	</div> 
		</div> 
			<div id="sec">
				<div id="secundar">
					 <jsp:directive.include file="../menus/MeniuProject.jsp" />	
				</div>
	
			<div id="create">
				<form action="http://localhost:8080/task/CreateProjectDo" method=POST>
					<br> <br> 
                    <label>Name</label>         
					<input type="text" name="denumire" required="true">
					<br>
					<br>
					<label>Description</label>      
					<br>   
					<textarea cols="25" rows="5" wrap="hard" name="descriere"></textarea>
					<br>
					<br>
					<label>User responsible</label> 
					 <select name="responsible">
					 <% List <User> mList = SelectUser.select();  %>
					 <%		for(int i=0;i<mList.size();i++){	
								 User user = (User)SelectUser.select().get(i); 
					 %>
				          <option value="<%= user.getUser() %> "><%= user.getUser() %></option>
 				      <% } %>    
				          </select>
				     <br>
				     <br>
					<input type="submit" name="submit" value="Create">
					<input type="reset" name="reset" value="Reset">
				</form>
			</div>
		</div>
</div>	
</body>
</html>