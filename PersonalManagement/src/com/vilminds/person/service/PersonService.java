package com.vilminds.person.service;


public interface PersonService {
	
	public void insertPersonal(String gender,String firstName,String lastName,String city,String country,
							String dob,int points,String company,String userName,String eMail, String password,
							String description);
	
	public void deletePersonal(String eMail); 
	
	public void displayPersonal();
	

}
