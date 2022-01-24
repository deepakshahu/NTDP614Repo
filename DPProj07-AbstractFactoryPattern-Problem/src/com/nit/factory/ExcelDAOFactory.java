package com.nit.factory;

import com.nit.dao.DAO;
import com.nit.dao.ExcelCourseDAO;
import com.nit.dao.ExcelStudentDAO;

//FactoryPattern / Simple Factory Pattern
public class ExcelDAOFactory {
	public static DAO createDAO(String type) {
		DAO dao = null;
		if(type.equalsIgnoreCase("student"))
			dao = new ExcelStudentDAO();
		else if(type.equalsIgnoreCase("course"))
			dao = new ExcelCourseDAO();
		else
			throw new IllegalArgumentException("Invalid DAO type");
		return dao;
	}
}