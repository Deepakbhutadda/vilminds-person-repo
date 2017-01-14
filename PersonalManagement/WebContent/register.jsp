<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
input[type=text], select {
    width: 35%;
    padding: 2px 2px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}	
body{
	background-color:black;
	}
h3{
	color:blue;
}
range{
	color:green;
}
div
{
	float: left;
   margin-left: 400px;
   margin-top : 10px;
   padding: 10px;
   max-width: 1000px;
   height: 950px;
   border-radius: 25px;
   border: 20px solid skyblue;
   background-color:white;
}
input[type=submit] {
    width: 25%;
    background-color: skyblue;
	color:white;
	padding:1px 1px;
	}
</style>

</head>
<body>

<div align="center"> 

<h1>Create a free account</h1>

<form action="registerServletpath" method="post">
<h3>1.Personal Information:</h3>

<right>Select a gender:<right><t>
<input type="radio" name="gender" value="male"> Male<t>
&nbsp &nbsp <input type="radio" name="gender" value="female">Female<br><br>

First Name:*<t> 
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  Last Name:*<br>
<input type="text" name="firstname" required><t>
&nbsp &nbsp <input type="text" name="lastname" required><br><br>

City/Town:<t>
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  &nbsp Country:<br>
<input type="text" name="city"><t>
&nbsp &nbsp <select name="country">
    <option value="india">India</option>
    <option value="usa">USA</option>
    <option value="germany">Germany</option>
    <option value="saudi">Saudi</option>
  </select><br><br> 

Date of Birth:*<t>
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  Age 55:<br>
<input type="date" name="dob" required><t>
&nbsp &nbsp <input type="range" name="points" min="18" max="100"><br><br>

Company:&nbsp &nbsp <t>
&nbsp &nbsp &nbsp &nbsp  &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  Do you have pet:<br>
<input type="text" name="country"><t>
&nbsp &nbsp <input type="checkbox" name="pet" value="dog"> Dog<t>

<input type="checkbox" name="pet" value="cat"> Cat<br>

<h3>2.Account information:</h3>
User Name:*<t> 
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp Email:*<br>
<input type="text" name="username" required><t>
&nbsp &nbsp <input type="text" name="email" required><br><br>

Password:*<t>&nbsp 
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp Re-enter Password:*<br>
<input type="password" name="pass" required><t>
&nbsp &nbsp <input type="password" name="pass" required><br>

<h3>3.A few word about yourself</h3>
<textarea rows="6" cols="50">
</textarea><br>

<h3>4. Terms and Conditions:</h3>
<input type="checkbox" name="terms"> By Clicking button to our Terms Use and Privacy Policy

<input type="submit" value="Create an account">
</div>
</form>

</body>
</html>