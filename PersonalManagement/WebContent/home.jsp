<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Management</title>
<link rel="stylesheet" type="text/css" href="css/home.css" />
</head>
<body>
<div id="wrapper">
	<div id="header-wrapper">
		<div id="header" class="container">
			<div id="logo">
				<a> <img src="Images/logo.jpg" width="120" height="120" alt="logo"> </a>
			</div>
			<div id="menu">
				<ul>
					<li class="current_page_item"><a href="#">Homepage</a></li>
					<li><a href="login.jsp">Login</a></li>
					
					
				</ul>
			</div>
		</div>
		<div id="banner">
			<div class="content"><img src="Images/banner.jpg" width="1200" height="400" alt="" /></div>
		</div>
	</div>
	
	<div id="featured-content">
		<div id="column1">
			<p><img src="Images/register.png" width="300" height="150" alt="register" /></p>
			<h2 align="center"><a href="register.jsp">Register</a></h2>
			
		</div>
		<div id="column2">
			<p><img src="Images/display.png" width="300" height="150" alt="display" /></p>
			<h2 align="center"><a href="personServletpath?action=getAllPersons">Display</h2>
	
		</div>
		<div id="column3">
			<p><img src="Images/search.png" width="300" height="150" alt="search" /></p>
			<h2 align="center"><a href="search.jsp">Search</a></h2>
			
		</div>
	</div>
	
	
</div>
<div id="footer">
	<p>&copy; All rights reserved.<a href="#">Vilminds Technologies</a></p>
</div>

</body>
</html>