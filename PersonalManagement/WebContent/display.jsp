<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.vilminds.person.model.Person"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">




<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/display.css"/>
</head>
<body>

<div align="center">


 <%
		 List<Person> personList = (List<Person>) request.getAttribute("myPersonList"); 
		       
 %>

<table border="1">
<tr>
<th>Gender</th>
<th>FirstName</th>
<th>LastName</th>
<th>City</th>
<th>Country</th>
<th>Age</th>
<th>Company</th>
<th>UserName</th>
<th>Email</th>
</tr>


<%
	for(Person per : personList)
	{
		
%>
<tr>
<td><%=per.getGender() %></td>
<td><%=per.getFirstName() %></td>
<td><%=per.getLastName() %></td>
<td><%=per.getCity()%></td>
<td><%=per.getCountry() %></td>
<td><%=per.getAge() %></td>
<td><%=per.getCompany() %></td>
<td><%=per.getUserName() %></td>
<td><%=per.geteMail() %></td>
<td><a href =" personServletpath?action=deletePersons&eMail=<%=per.geteMail() %>" >Delete</a></td>
<td><a href =" personServletpath?action=updatePersons&eMail=<%=per.geteMail() %>" >Update</a></td>
</tr>
<%
        }
%>

</table>


</body>
</html>