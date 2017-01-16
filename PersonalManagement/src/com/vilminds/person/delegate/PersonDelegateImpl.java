package com.vilminds.person.delegate;

import com.vilminds.person.service.PersonServiceImpl;

public class PersonDelegateImpl implements PersonDelegate {

	
	public void insertPersonal(String gender,String firstName,String lastName,String city,String country,
			String dob,int age,String company,String userName,String eMail, String password,
			String description) {
		// TODO Auto-generated method stub
		
		PersonServiceImpl personservice = new PersonServiceImpl();
		personservice.insertPersonal(gender,firstName, lastName,city, country,dob,age,company,userName,eMail, password, description);
		
	}

}
