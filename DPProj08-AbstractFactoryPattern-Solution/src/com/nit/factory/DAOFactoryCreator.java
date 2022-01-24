package com.nit.factory;

//Abstract factory pattern returning one of the several factory classes object
public class DAOFactoryCreator {
	
	public static DAOFactory buildDAOFactory(String type) {
		DAOFactory factory = null;
		if(type.equalsIgnoreCase("DB"))
			factory = new DBDAOFactory();
		else if(type.equalsIgnoreCase("Excel"))
			factory = new ExcelDAOFactory();
		else
			throw new IllegalArgumentException("Invalid Factory type");
		return factory;
	}
}
