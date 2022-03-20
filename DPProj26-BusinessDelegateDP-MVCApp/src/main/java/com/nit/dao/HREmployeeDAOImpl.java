package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nit.bo.HREmployeeBO;

public class HREmployeeDAOImpl implements IHREmployeeDAO {
	private static final String INSERT_HR_EMPLOYEE = "INSERT INTO BD_HR_EMPLOYEE VALUES(BD_EMPNO_SEQ.NEXTVAL,?,?,?)";

	@Override
	public boolean insertEmployee(Connection con,HREmployeeBO hrBo) throws SQLException, Exception {
		PreparedStatement ps = null;
		try {		
			//Create PreparedStatement object
			ps = con.prepareStatement(INSERT_HR_EMPLOYEE);
			//Set values to query params
			ps.setString(1, hrBo.getEmpName());
			ps.setString(2, hrBo.getEmpAddrs());
			ps.setString(3, hrBo.getEmpDesg());
			//Execute the query
			int count = ps.executeUpdate();
			if(count==0)
				return false;
			else
				return true;
		}//try
		catch(SQLException se) {
			se.printStackTrace();
			throw se;  //exception re=throwing
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;  //exception re=throwing
		}
		
	}//method
}//class