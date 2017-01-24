package com.vilminds.person.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vilminds.person.delegate.PersonDelegateImpl;
import com.vilminds.person.model.Person;

public class PersonServlet extends HttpServlet {
	
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String action =	request.getParameter("action");	
	System.out.println("User Operation is:"+action);
	if(action.equals("register"))
		
	{
		response.setContentType("text/html");
		System.out.println("<h3>User Information</h3>");
		PrintWriter out = response.getWriter();
		String gender = request.getParameter("gender");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String city = request.getParameter("city");
		String country = request.getParameter("country");
		String dob = request.getParameter("dob");
		System.out.println(request.getParameter("age"));
		int age = Integer.parseInt(request.getParameter("age"));
		String company = request.getParameter("company");
		String userName = request.getParameter("userName");
		String eMail = request.getParameter("eMail");
		String password = request.getParameter("password");
		String description = request.getParameter("description");
		
		PersonDelegateImpl register = new PersonDelegateImpl();
		register.insertPersonal(gender,firstName,lastName,city,country,dob,age,company,userName,eMail,password,description);
	
		response.sendRedirect("home.jsp");
	}
	
	if(action.equals("updatePersonDetails"))
	{
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String city = request.getParameter("city");
		String country = request.getParameter("country");
		int age =Integer.parseInt(request.getParameter("age"));
		String company = request.getParameter("company");
		String userName = request.getParameter("userName");
		String eMail = request.getParameter("eMail");
		
		System.out.println("firstName: "+firstName);
		System.out.println("lastName: "+lastName);
		System.out.println("city: "+city);
		System.out.println("country: "+country);
		System.out.println("age: "+age);
		System.out.println("company: "+company);
		System.out.println("userName: "+userName);
		System.out.println("eMail: "+eMail);
		
		PersonDelegateImpl register = new PersonDelegateImpl();
		register.updatePersonal(firstName,lastName,city,country,age,company,userName,eMail);

		ArrayList<Person> personList = register.displayPersonal();
		request.setAttribute("myPersonList",personList);
		RequestDispatcher rd = request.getRequestDispatcher("/display.jsp");
		rd.forward(request, response);
	}
	
	
	if(action.equals("searchPerson"))
	{
		String firstName = request.getParameter("firstName");
		PersonDelegateImpl register = new PersonDelegateImpl();
		register.searchPersonal(firstName);
		ArrayList<Person> personSearch = register.searchPersonal(firstName);
		request.setAttribute("Search", personSearch);
		RequestDispatcher rd = request.getRequestDispatcher("/search.jsp");
		rd.forward(request, response);
		
	}
	
	if(action.equals("loginPersonal"))
	{
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		PersonDelegateImpl register = new PersonDelegateImpl();
		if(register.loginPersonal(userName,password))
		{
			 System.out.println("login success redirecting to home.jsp");
			RequestDispatcher rd=request.getRequestDispatcher("/home.jsp");  
	        rd.forward(request,response);  
		}
		 else
		 {  
			 System.out.println("login failed redirecting to login.jsp");
			
		    RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");  
		    rd.forward(request,response); 
		    
	
	     }		
	}
}
	

	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
		PersonDelegateImpl register = new PersonDelegateImpl();
		String action =	req.getParameter("action");
		String eMail =	req.getParameter("eMail");
		if(action.equals("deletePersons"))
		{
			
			register.deletePersonal(eMail);
			ArrayList<Person> personList = register.displayPersonal();
			req.setAttribute("myPersonList",personList);
			RequestDispatcher rd = req.getRequestDispatcher("/display.jsp");
			rd.forward(req, resp);
		}
		if(action.equals("updatePersons"))
		{
			Person p = register.getPersonDetails(eMail);
			req.setAttribute("person", p);
			RequestDispatcher rd = req.getRequestDispatcher("/update.jsp");
			rd.forward(req, resp);
		}
		
		if (action.equals("getAllPersons"))
		{
			
			ArrayList<Person> personList = register.displayPersonal();
			req.setAttribute("myPersonList",personList);
			RequestDispatcher rd = req.getRequestDispatcher("/display.jsp");
			rd.forward(req, resp);
		}
		System.out.println("Doget Called!!");
		
		
		}
	
}
