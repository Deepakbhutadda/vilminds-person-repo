package com.vilminds.person.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterDao {
	
	private Connection getConnection()
	{
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vilminds?", "root", "password@123");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}

	public void insertData(String gender,String firstName,String lastName,String city,String country,
			String dob,int points,String company,String userName,String eMail, String password,
			String rePassword,String description) {
		// TODO Auto-generated method stub
		System.out.println("Gender= "+gender);
		System.out.println("FirstName= "+firstName);
		System.out.println("LastName= "+lastName);
		System.out.println("City= "+city);
		System.out.println("Country= "+country);
		System.out.println("Dob= "+dob);
		System.out.println("Age= "+points);
		System.out.println("Company= "+company);
		System.out.println("UserName= "+userName);
		System.out.println("Email= "+eMail);
		System.out.println("Password= "+password);
		System.out.println("Re-Password= "+rePassword);
		System.out.println("Descriptioon= "+description);
	}

}


