
<html>
<head>
<title><%= (String)session.getAttribute("firstname")%></title>
<style> <jsp:directive.include file="css/style.jsp"/> </style>
</head>
<body>
<div>
<div id"page">
	<div id="header">
       <h3>Today's date: <%= (new java.util.Date()).toLocaleString()%></h3>
       <h2>Hello <%= (String)session.getAttribute("firstname") %></h2>
	</div>
	
	<div id="meniu">
    <jsp:directive.include file="menus/Meniu.jsp" />
	</div> 
	<div id="sec" style="background-image:url(css/fundal.jpg);";>
		
	</div>
</div>
</body>
</html>
