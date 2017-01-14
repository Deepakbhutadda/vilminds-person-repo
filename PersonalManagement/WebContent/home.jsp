<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	margin: 0;
	padding: 0;
	background: white;
	font-family: 'Open Sans', sans-serif;
	font-size: 13px;
}

#wrapper {
}

.container {
	width: 1000px;
	margin: 0px auto;
}
#header-wrapper {
	overflow: hidden;
	height: 600px;
	background: black;
}
#logo {
	float: left;
	width: 300px;
	margin: 0;
	padding: 0;
	
}

#logo h1, #logo p {
}

#logo h1 {
	line-height: 120px;
	letter-spacing: -2px;
	font-size: 3em;
}

#logo p a {
	color: #8E8E8E;
}

#logo a {
	border: none;
	background: none;
	text-decoration: none;
	color: #12212F;
}
#menu {
	float: right;
	width: 500px;
	height: 90px;
	margin: 0 auto;
	padding: 0;
}

#menu ul {
	float: right;
	margin: 0;
	padding: 50px 0px 0px 0px;
	list-style: none;
	line-height: normal;
}

#menu li {
	float: left;
	padding: 0px 0px 0px 0px;
}

#menu a {
	display: block;
	margin-right: 1px;
	padding: 10px 20px 10px 20px;
	text-decoration: none;
	text-align: center;
	font-size: 13px;
	font-weight: 300;
	color: #FFFFFF;
	border: none;
}

#footer {
	height: 40px;
	margin: 0 auto;
	padding: 50px 0 15px 0;
	background: black;
}

#footer p {
	margin: 0;
	padding-top: 10px;
	letter-spacing: 1px;
	line-height: normal;
	text-align: center;
	color: white;
}

#banner {
	margin: 0px auto;
	width: 1000px;
	height: 440px;
}

#banner .content {
}
#featured-content {
	overflow: hidden;
	width: 1000px;
	margin: 0px auto;
	padding: 30px 0px;
	border-bottom: 5px solid #E9EAEE;	
}

#featured-content h2 {
	padding: 0px 0px 20px 0px;
	font-size: 30px;
}

#featured-content #column1 {
	float: left;
	width: 300px;
	margin-right: 50px;
}

#featured-content #column2 {
	float: left;
	width: 300px;
}

#featured-content #column3 {
	float: right;
	width: 300px;
}
</style>

</head>
<body>
<div id="wrapper">
	<div id="header-wrapper">
		<div id="header" class="container">
			<div id="logo">
				<a> <img src="Images/logo.jpg" width="120" height="120"> </a>
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
			<h2 align="center"><a href="register.jsp">Register</a></h2>
			<p><img src="Images/register.png" width="300" height="150" alt="" /></p>
			
		</div>
		<div id="column2">
			<h2 align="center">Display</h2>
			<p><img src="Images/display.png" width="300" height="150" alt="" /></p>
	
		</div>
		<div id="column3">
			<h2 align="center">Delete</h2>
			<p><img src="Images/remove.png" width="300" height="150" alt="" /></p>
			
		</div>
	</div>
	
	
</div>
<div id="footer">
	<p>&copy; All rights reserved.<a href="home.jsp/">Vilminds Technologies</a></p>
</div>

</body>
</html>