package com.nit.factory;

import com.nit.dao.DAO;
import com.nit.dao.DBCourseDAO;
import com.nit.dao.DBStudentDAO;

//FactoryPattern / Simple Factory Pattern
public class DBDAOFactory implements DAOFactory{
	public DAO createDAO(String type) {
		DAO dao = null;
		if(type.equalsIgnoreCase("student"))
			dao = new DBStudentDAO();
		else if(type.equalsIgnoreCase("course"))
			dao = new DBCourseDAO();
		else
			throw new IllegalArgumentException("Invalid DAO type");
		return dao;
	}
}