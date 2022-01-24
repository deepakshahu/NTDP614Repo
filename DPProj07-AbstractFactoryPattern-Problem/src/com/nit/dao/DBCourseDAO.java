package com.nit.dao;

public class DBCourseDAO implements DAO {

	@Override
	public void insert() {
		System.out.println("DBStudentDAO.insert() :: inserting course details to DB");
	}
}