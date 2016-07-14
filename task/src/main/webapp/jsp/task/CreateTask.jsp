<html>
<head>
	<title>Tasks</title>
	<style> <jsp:directive.include file="../css/style.jsp"/> </style>
</head>

<body>
	<div id="header">
			 <h2>Hello <%= (String)session.getAttribute("firstname") %></h2>
   			  <h5>id sesion: <% out.print( session.getId()); %></h5>
	</div>
	
	<div id="meniu">
   			 <jsp:directive.include file="../menus/Meniu.jsp" />
	</div> 
	<div id="sec">
		<div id="secundar">
				 <jsp:directive.include file="../menus/MeniuTask.jsp" />	
		</div>
	
		<div id="create">
			<form action= method=POST>
					<br> <br> 
                    <label>Name</label>         
					<input type="text" name="denumire" required="true">
					<br>
					<label>Description</label>         
					<input type="text" name="descriere" required="true">
					<br>
					<label>Release</label>         
					<select name="release">         
					<option value="1">Version 1.0</option>
					<option value="2">Version 1.1</option>
					<option value="2">Version 1.2</option>
					</select>
					<br>
					<label>Priority</label>         
					<select name="priority">         
					<option value="1">Level 1</option>
					<option value="2">Level 2</option>
					<option value="2">Level 3</option>
					</select>
					<br>
					<label>Status</label>         
					<select name="status">         
					<option value="1">Begin</option>
					</select>
				
					<input type="submit" name="submit" value="Create">
					<input type="reset" name="reset" value="Reset">
			</form>
		</div>
	</div>
</body>
</html>