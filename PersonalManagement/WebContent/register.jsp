<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/register.css" />
</head>
<body>

<div align="center"> 

<h1>Create a free account</h1>

<form action="personServletpath" method="post">
<h3>1.Personal Information:</h3>

<right>Select a gender:<right><t>
<input type="radio" name="gender" value="male"> Male<t>
&nbsp &nbsp <input type="radio" name="gender" value="female">Female<br><br>

First Name:*<t> 
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  Last Name:*<br>
<input type="text" name="firstName" required><t>
&nbsp &nbsp <input type="text" name="lastName" required><br><br>

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
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  Age:<br>
<input type="date" name="dob" required><t>
&nbsp &nbsp <input type="text" name="age"><br><br>

Company:&nbsp &nbsp <t>
&nbsp &nbsp &nbsp &nbsp  &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  Do you have pet:<br>
<input type="text" name="company"><t>
&nbsp &nbsp <input type="checkbox" name="pet" value="dog"> Dog<t>

<input type="checkbox" name="pet" value="cat"> Cat<br>

<h3>2.Account information:</h3>
User Name:*<t> 
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp Email:*<br>
<input type="text" name="userName" required><t>
&nbsp &nbsp <input type="text" name="eMail" required><br><br>

Password:*<t>&nbsp 
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp Re-enter Password:*<br>
<input type="password" name="password" required><t>
&nbsp &nbsp <input type="password" name="pass" required><br>

<h3>3.A few word about yourself</h3>
<textarea rows="6" cols="50" name="description">
</textarea><br>

<h3>4. Terms and Conditions:</h3>
<input type="checkbox" name="terms"> By Clicking button to our Terms Use and Privacy Policy

<input type="submit" value="Create an account">
</div>
</form>

</body>
</html>