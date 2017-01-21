<%@page import="com.vilminds.person.model.Person"%>
<%@page import="com.vilminds.person.service.PersonService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/update.css" />
</head>
<body>

<div align="center"> 
 <%
		 Person person1 = (Person)request.getAttribute("person"); 
		       
 %>


<form action="personServletpath" method="post">

<input type="hidden" name="action" value="updatePersonDetails"/>

First Name:<t> 
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  Last Name:<br>
<input type="text" name="firstName" value=<%= person1.getFirstName()%>><t>
&nbsp &nbsp <input type="text" name="lastName" value=<%=person1.getLastName()%>><br><br>

City:<t>
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  &nbsp Country:<br>
<input type="text" name="city" value="<%= person1.getCity()%>"><t>
&nbsp &nbsp <select name="country" readonly>
    <option value="india">India</option>
    <option value="usa">USA</option>
    <option value="germany">Germany</option>
    <option value="saudi">UAE</option>
  </select><br><br> 


Age:<t>
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbspCompany:&nbsp &nbsp<br>
<input type="text" name="age" value="<%= person1.getAge() %>"><t>
&nbsp &nbsp<input type="text" name="company" value="<%= person1.getCompany() %>"><br><br>

User Name:<t> 
&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp Email:<br>
<input type="text" name="userName" value="<%= person1.getUserName()%>"><t>
&nbsp &nbsp <input type="text" name="eMail" value="<%=person1.geteMail() %>" readonly><br><br>

<input type="submit" value="Update">


</div>
</form>

</body>
</html>