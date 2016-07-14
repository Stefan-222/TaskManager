<html>
<head>
	<title>Tasks</title>
	<style> <jsp:directive.include file="../css/style.jsp"/> </style>
</head>

<body>
<div id="page">
	<div id="header">
			 <h2>Hello <%= (String)session.getAttribute("firstname") %>!</h2>
   			  <h5>id sesion: <% out.print( session.getId()); %></h5>
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
					<label>Description</label>         
					<input type="text" name="descriere" required="true">
					<br>
					<input type="submit" name="submit" value="Create">
					<input type="reset" name="reset" value="Reset">
				</form>
			</div>
		</div>
</div>	
</body>
</html>