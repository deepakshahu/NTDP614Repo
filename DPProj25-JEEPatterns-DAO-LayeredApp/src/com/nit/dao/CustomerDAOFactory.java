package com.nit.dao;

//Factory Pattern
public class CustomerDAOFactory {
	
	public static ICustomerDAO getInstance(String type) {
		if(type.equalsIgnoreCase("jdbc"))
			return new CustomerDAOJdbcImpl();
		else
			throw new IllegalArgumentException("Invalid DAO type");
	}
}//class