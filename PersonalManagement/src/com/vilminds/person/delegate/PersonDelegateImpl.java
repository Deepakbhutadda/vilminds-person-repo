package com.vilminds.person.delegate;

import java.util.ArrayList;

import com.vilminds.person.model.Person;
import com.vilminds.person.service.PersonServiceImpl;

public class PersonDelegateImpl implements PersonDelegate {

	
	public void insertPersonal(String gender,String firstName,String lastName,String city,String country,
			String dob,int age,String company,String userName,String eMail, String password,
			String description) {
		// TODO Auto-generated method stub
		
		PersonServiceImpl personservice = new PersonServiceImpl();
		personservice.insertPersonal(gender,firstName, lastName,city, country,dob,age,company,userName,eMail, password, description);
		
	}
	
	
	public void deletePersonal(String eMail)
	{
		PersonServiceImpl personservice = new PersonServiceImpl();
		personservice.deletePersonal(eMail);
	}

	public ArrayList<Person> displayPersonal()
	{
		PersonServiceImpl personservice = new PersonServiceImpl();
		
		return personservice.displayPersonal();
	}

	@Override
	public void updatePersonal(String gender,String firstName,String lastName,String city,String country,
			int age,String company,String userName,String eMail) {
		// TODO Auto-generated method stub
		
		PersonServiceImpl personservice = new PersonServiceImpl();
		personservice.updatePersonal(gender,firstName,lastName,city,country,age,company,userName,eMail);
	}


}
