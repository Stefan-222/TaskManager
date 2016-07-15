<html>
<head>
	<title>Project</title>
	<style> <jsp:directive.include file="../css/style.jsp"/> </style>
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
				<form action="http://localhost:8080/task/DeleteProjectDo" method=POST>
					<br> <br> 
                    <label>Project id</label>         
					<input type="text" name="id" required="true">
					<input type="submit" name="submit" value="Delete">		
				</form>
			</div>
		</div>
</div>	
</body>
</html>