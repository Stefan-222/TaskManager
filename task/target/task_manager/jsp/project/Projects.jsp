<html>
<head>
	<title>Tasks</title>
	<style> <jsp:directive.include file="../css/style.jsp"/> </style>
</head>

<body>
<div id"page">
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
	
	
	</div>
</div>	
</body>
</html>