<html>
<head>
	<title>Projects</title>
	<style> <jsp:directive.include file="css/style.jsp"/> </style>
</head>

<body>
<div id="page">
	<div id="header">
			 <h2>Hello <%= (String)session.getAttribute("firstname") %></h2>
   			  <h5>id sesion: <% out.print( session.getId()); %></h5>
	</div>
	
	<div id="meniu">
   			 <jsp:directive.include file="menus/Meniu.jsp" />
	</div> 

	<div id="sec">
		<div id="secundar">
				 <jsp:directive.include file="menus/MeniuProject.jsp" />	
		</div>
	
		<div id="create">
			<form action="http://localhost:8080/task/SeeProjectsTrue" method=POST>
			Project Name:<br> 
			<input type="text" name="project">
			<br> 
			<br> 
			<input type="submit" value="Search"> 
			</form>
		</div>
	</div>
</div>
</body>
</html>