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
	
	public void updatePersonal(String firstName,String lastName,String city,String country,
			int age,String company,String userName,String eMail)
	{
			Connection con=getConnection();
			
			String sql = "UPDATE `personal` SET `firstName`='"+firstName+"',`lastName`='"+lastName+"',`city`='"+city+"',`country`='"+country+"',`age`='"+age+"',`company`='"+company+"',`userName`='"+userName+"' WHERE `eMail`='"+eMail+"'";
			System.out.println("Person update query"+sql);
			
			
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
				
				personList.add(per);
								
			}	
			
			} catch (SQLException e) {
			System.err.println("Error occured Displaying personal");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return personList;
		
	}	
	
	public ArrayList<Person> searchPersonal(String firstName)
	{
		Connection con = getConnection();
		
		String sql = "SELECT * FROM personal WHERE firstName LIKE '%" + firstName + "%'";
		ArrayList<Person> personSearch = new ArrayList<Person>();
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql); 
			
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
				
				personSearch.add(per);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Error occured while Searching personal");
			e.printStackTrace();
		}
		
		 return personSearch;
	}


	public Person getPersonDetail(String eMail) {
		// TODO Auto-generated method stub
		Connection con = getConnection();
		Person person1 = new Person();
		String sql = "SELECT * FROM personal WHERE eMail= '"+eMail+"'";
		
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql); 
			
			while(rs.next())
			{

				String firstName1 = rs.getString("firstName");
				String lastName1 = rs.getString("lastName");
				String city1 = rs.getString("city");
				String country1 = rs.getString("country");
				System.out.println(rs.getString("age"));
				int age1 = Integer.parseInt(rs.getString("age"));
				String company1 = rs.getString("company");
				String userName1 = rs.getString("userName");
				String eMail1 = rs.getString("eMail");
				
				person1.setFirstName(firstName1);
				person1.setLastName(lastName1);
				person1.setCity(city1);
				person1.setCountry(country1);
				person1.setAge(age1);
				person1.setCompany(company1);
				person1.setUserName(userName1);
				person1.seteMail(eMail1);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Error occured while Searching personal");
			e.printStackTrace();
		}
		
		return person1;
	}

	public boolean loginPersonal(String userName,String password)
	{
		Connection con = getConnection();
		
		Person per1 = new Person();
		boolean loginSuccess = false;
		String sql = "SELECT * FROM personal WHERE userName= '"+userName+"' AND password= '"+password+"' ";
		System.out.println("SQL Query"+sql);
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				loginSuccess = true;
				String userName1 = rs.getString("userName");
				String password1 = rs.getString("password");
				System.out.println("Login Success"+userName1);
				
				per1.setUserName(userName1);
				per1.setUserName(password1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("loginSuccess value"+loginSuccess);
		return loginSuccess;
	}

	
}


