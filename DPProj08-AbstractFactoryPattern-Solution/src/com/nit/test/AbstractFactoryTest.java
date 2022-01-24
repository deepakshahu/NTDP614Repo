 package com.nit.test;

import com.nit.dao.DAO;
import com.nit.factory.DAOFactory;
import com.nit.factory.DAOFactoryCreator;

public class AbstractFactoryTest {
	
	public static void main(String[] args) {
		
		//Get factory
		DAOFactory factory = DAOFactoryCreator.buildDAOFactory("DB");
		//Create DAO classes object using factory
		DAO studDAO = factory.createDAO("Student");
		DAO courseDAO = factory.createDAO("course");
		studDAO.insert();
		System.out.println("--------------------------------------------");
		courseDAO.insert();
	}//main
}//class