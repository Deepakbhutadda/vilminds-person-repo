package com.vilminds.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		System.out.println("<h3>User Information</h3>");
		PrintWriter out = response.getWriter();
		String gen = request.getParameter("gender");
		String fname = request.getParameter("firstName");
		String lname = request.getParameter("lastName");
		String cityname = request.getParameter("city");
		String countryname = request.getParameter("country");
		String date = request.getParameter("dob");
		int age = Integer.parseInt("points");
		String cmpy = request.getParameter("company");
		String uname = request.getParameter("userName");
		String email = request.getParameter("eMail");
		String pass = request.getParameter("password");
		String pass1 = request.getParameter("rePassword");
		String desc = request.getParameter("description");
		
		PersonDelegateImpl register = new PersonDelegateImpl();
		register.insertData(fname,lname);
		
		out.println("Gender is "+gen);
		out.println("First Name is "+fname);
		out.println("Last Name is "+lname);
		out.println("City is "+cityname);
		out.println("Country is "+countryname);
		out.println("Dob is "+date);
		out.println("Age is "+age);
		out.println("company is "+cmpy);
		out.println("userName is "+uname);
		out.println("eMail is "+email);
		out.println("password is "+pass);
		out.println("rePassword is "+pass1);
		out.println("description is "+desc);
	}
	

}
