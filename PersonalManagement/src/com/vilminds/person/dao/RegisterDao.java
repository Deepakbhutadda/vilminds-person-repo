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
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vilminds", "root", "password@123");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	

	public void insertPersonal(String gender,String firstName,String lastName,String city,String country,
			String dob,int age,String company,String userName,String eMail, String password,
			String description) {
		// TODO Auto-generated method stub
		System.out.println("Gender= "+gender);
		System.out.println("FirstName= "+firstName);
		System.out.println("LastName= "+lastName);
		System.out.println("City= "+city);
		System.out.println("Country= "+country);
		System.out.println("Dob= "+dob);
		System.out.println("Age= "+age);
		System.out.println("Company= "+company);
		System.out.println("UserName= "+userName);
		System.out.println("Email= "+eMail);
		System.out.println("Password= "+password);
		System.out.println("Description= "+description);
		
		Connection con=getConnection();
		
		
		String sql = "INSERT INTO `vilminds'.'personal` VALUES ('"+gender+"', '"+firstName+"', '"+lastName+"', '"+city+"', '"+ country+"', '"+dob+"', '"+age+"', '"+company+"', '"+userName+"', '"+eMail+"', '"+password+"', '"+description+"');";
		
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Values Inserted Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Error occured while Inserting values:"+e.getMessage());
			e.printStackTrace();
			
		}
		
	}
	

	public void deletePersonal(String firstName1)
	{
		Connection con = getConnection();
		
		String sql = "DELETE FROM `personal` WHERE `firstName`='"+firstName1+"'";
		
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Values are updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


