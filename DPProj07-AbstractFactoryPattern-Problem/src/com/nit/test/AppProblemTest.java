package com.nit.test;

import com.nit.dao.DAO;
import com.nit.factory.DBDAOFactory;
import com.nit.factory.ExcelDAOFactory;

public class AppProblemTest {
	
	public static void main(String[] args) {
		DAO studDAO = DBDAOFactory.createDAO("student");
		DAO courseDAO = ExcelDAOFactory.createDAO("course");
		studDAO.insert();
		System.out.println("--------------------------------------------");
		courseDAO.insert();
	}//main
}//class