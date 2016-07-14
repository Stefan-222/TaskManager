
<html>
<head>
<title><%= (String)session.getAttribute("firstname")%></title>
<style> <jsp:directive.include file="css/style.jsp"/> </style>
</head>
<body>
<div>
	<div id="header">
	
       <h2>Hello <%= (String)session.getAttribute("firstname") %></h2>
       <h5>id sesion: <% out.print( session.getId()); %></h5>
	</div>
	
	<div id="meniu">
    <jsp:directive.include file="menus/Meniu.jsp" />
	</div> 
	<div id="sec">
		
	</div>
</div>
</body>
</html>
