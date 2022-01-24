package com.nit.dao;

public class DBStudentDAO implements DAO {

	@Override
	public void insert() {
		System.out.println("DBStudentDAO.insert() :: inserting student details to DB");
	}
}