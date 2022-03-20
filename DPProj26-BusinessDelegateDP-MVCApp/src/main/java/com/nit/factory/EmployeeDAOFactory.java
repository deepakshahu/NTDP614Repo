package com.nit.factory;

import com.nit.dao.FinanceEmployeeDAOImpl;
import com.nit.dao.HREmployeeDAOImpl;
import com.nit.dao.IEmployeeDAO;

public class EmployeeDAOFactory {
	
	public static IEmployeeDAO getInstance(String type) {
		if(type.equalsIgnoreCase("HR"))
			return new HREmployeeDAOImpl();
		else if(type.equalsIgnoreCase("finance"))
			return new FinanceEmployeeDAOImpl();
		else
			throw new IllegalArgumentException("Invalid DAO type");
	}

}//class
