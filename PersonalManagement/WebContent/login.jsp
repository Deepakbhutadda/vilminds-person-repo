<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/login.css" />
</head>
<body>
<body>

<h1 align="center">LOGIN</h1>
<div align="center">
<form action="personServletpath" method="post">
<input type="hidden" name="action" value="loginPersonal"/>
<input type="text" name="userName" placeholder="Username" required>
<br><br>
<input type="password" name="password" placeholder="Password" required><br><br>
<input type="Submit" value="SignIn"><br><br>
</form>
<a href="register.jsp"> Can't access account/register</a> 
</div>

</body>
</html>