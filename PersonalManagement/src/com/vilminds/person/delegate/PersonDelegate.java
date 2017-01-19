package com.vilminds.person.delegate;

import java.util.ArrayList;

import com.vilminds.person.model.Person;

public interface PersonDelegate {
	
	public void insertPersonal(String gender,String firstName,String lastName,String city,String country,
			String dob,int points,String company,String userName,String eMail, String password,
			String description);
	
	public void deletePersonal(String eMail);

	public ArrayList<Person> displayPersonal();
}
