package com.vilminds.person.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.generic.RET;
import com.vilminds.person.model.Person;

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
		System.out.println("firstName= "+firstName);
		System.out.println("lastName= "+lastName);
		System.out.println("city= "+city);
		System.out.println("country= "+country);
		System.out.println("dob= "+dob);
		System.out.println("age= "+age);
		System.out.println("company= "+company);
		System.out.println("userName= "+userName);
		System.out.println("eMail= "+eMail);
		System.out.println("password= "+password);
		System.out.println("description= "+description);
		
		Connection con=getConnection();
		
		String sql = " INSERT INTO `vilminds`.`personal` VALUES ('"+gender+"', '"+firstName+"', '"+lastName+"', '"+city+"', '"+country+"', '"+dob+"', '"+age+"', '"+company+"', '"+userName+"', '"+eMail+"', '"+password+"', '"+description+"');";
		
		System.out.println("SQL Query"+sql);
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
	
	public void updatePersonal(String gender,String firstName,String lastName,String city,String country,
			int age,String company,String userName,String eMail)
	{
			Connection con=getConnection();
			
			String sql = "UPDATE `personal` SET `gender`='"+gender+"',`firstName`='"+firstName+"',"
					+ "							`lastName`='"+lastName+"',`city`='"+city+"',`country`='"+country+"',`age`='"+age+"',"
							+ "					`company`='"+company+"',`userName`='"+userName+"' WHERE `eMail`='"+eMail+"'";

			try {
				Statement stmt = con.createStatement();
				stmt.executeUpdate(sql);
				System.out.println("Updated Successfully");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.err.println("Error occured while Updateing personal:");
				e.printStackTrace();

			}
	}
	
	

	public void deletePersonal(String eMail)
	{
		Connection con = getConnection();
		
		String sql = "DELETE FROM `personal` WHERE `eMail`='"+eMail+"'";
		System.out.println("SQL Query"+sql);
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Values are updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public ArrayList<Person> displayPersonal()
	{
		Connection con = getConnection();
		
		String sql = "SELECT * FROM personal;";
		
		ResultSet rs = null;
		
		ArrayList<Person> personList = new ArrayList<Person>();
		try {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				
				Person per = new Person();
				
				String gender1 = rs.getString("gender");
				String firstName1 = rs.getString("firstName");
				String lastName1 = rs.getString("lastName");
				String city1 = rs.getString("city");
				String country1 = rs.getString("country");
				System.out.println(rs.getString("age"));
				int age1 = Integer.parseInt(rs.getString("age"));
				String company1 = rs.getString("company");
				String userName1 = rs.getString("userName");
				String eMail1 = rs.getString("eMail");

				per.setGender(gender1);
				per.setFirstName(firstName1);
				per.setLastName(lastName1);
				per.setCity(city1);
				per.setCountry(country1);
				per.setAge(age1);
				per.setCompany(company1);
				per.setUserName(userName1);
				per.seteMail(eMail1);
				
				
				System.out.println("Gender= "+gender1);
				System.out.println("firstName= "+firstName1);
				System.out.println("lastName= "+lastName1);
				System.out.println("city= "+city1);
				System.out.println("country= "+country1);
				System.out.println("age= "+age1);
				System.out.println("company= "+company1);
				System.out.println("userName= "+userName1);
				System.out.println("eMail= "+eMail1);
				
				personList.add(per);
								
			}	
			
			} catch (SQLException e) {
			System.err.println("Error occured Displaying personal");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return personList;
		
	}	
	
	
	
	public void searchPersonal(String firstName2)
	{
		Connection con = getConnection();
		
		String sql = "SELECT * FROM personal WHERE firstName= '"+firstName2+"'";
		
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql); 
			
			while(rs.next())
			{
				String firstName = rs.getString("firstName");
				
				System.out.println("firstName: "+firstName);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Error occured while Searching personal");
			e.printStackTrace();
		}
	}



}


