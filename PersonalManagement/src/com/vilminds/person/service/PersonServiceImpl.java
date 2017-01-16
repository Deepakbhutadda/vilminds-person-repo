package com.vilminds.person.service;

import com.vilminds.person.dao.RegisterDao;
import com.vilminds.person.service.PersonService;

public class PersonServiceImpl implements PersonService {

	public void insertPersonal(String gender,String firstName,String lastName,String city,String country,
			String dob,int age,String company,String userName,String eMail, String password,
			String description) {
		// TODO Auto-generated method stub
	
		RegisterDao register = new RegisterDao();
		register.insertPersonal(gender,firstName,lastName,city,country,dob,age,company,userName,eMail, password, description); 
	}
	
	
	
	
}
