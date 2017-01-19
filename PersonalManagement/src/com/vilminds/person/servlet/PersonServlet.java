package com.vilminds.person.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vilminds.person.delegate.PersonDelegateImpl;
import com.vilminds.person.model.Person;

public class PersonServlet extends HttpServlet {
	
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
		
		out.println("Gender is "+gender);
		out.println("firstName is "+firstName);
		out.println("lastName is "+lastName);
		out.println("city is "+city);
		out.println("country is "+country);
		out.println("dob is "+dob);
		out.println("age is "+age);
		out.println("company is "+company);
		out.println("userName is "+userName);
		out.println("eMail is "+eMail);
		out.println("password is "+password);
		out.println("description is "+description);
	}
	

	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			
		System.out.println("Doget Called!!");
		PersonDelegateImpl register = new PersonDelegateImpl();
		ArrayList<Person> personList = register.displayPersonal();
		
		resp.sendRedirect("display.jsp");
		
		}

}
