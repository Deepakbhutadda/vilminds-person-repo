<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
input[type=text], select {
    width: 50%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=password], select {
    width: 50%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 50%;
    background-color: green;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
	}
div {
	 border-radius: 2px;
    background-color: lightgray;
    padding: 10px;
}
body
	{
	background-color: black;
	padding:160px;
}
</style>

</head>
<body>
<body>

<h1 align="center">LOGIN</h1>
<div align="center">
<form action="simpleServletpath" method="post">
<input type="text" name="userid" placeholder="Username" required>
<br><br>
<input type="password" name="psw" placeholder="Password" required><br><br>
<input type="Submit" value="SignIn"><br><br>
</form>
<a href="register.jsp"> Can't access account/register</a> 
</div>

</body>
</html>