<%@page import="com.vilminds.person.model.Person"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/search.css" />
</head>
<body>
<div align="center">
<form action="personServletpath" method="post">
<input type="hidden" name="action" value="searchPerson"/>
 Enter FirstName:
<input type="text" name=firstName>
<input type="submit" value="Search">
</form>
 <%
		 ArrayList<Person> personSearch = (ArrayList<Person>) request.getAttribute("Search"); 
		       
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
	if(personSearch!=null)
	{
		
	
	for(Person per : personSearch)
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
</tr>
<%
	}    
	}
%>
</div>
</body>
</html>