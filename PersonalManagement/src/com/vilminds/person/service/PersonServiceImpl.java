package com.vilminds.person.service;

import com.vilminds.dao.RegisterDao;
import com.vilminds.service.PersonService;

public class PersonServiceImpl implements PersonService {

	public void insertData(String firstName, String lastName) {
		// TODO Auto-generated method stub
	
		RegisterDao register = new RegisterDao();
		register.insertData(firstName,lastName); 
	}
	
	
	
	
}
