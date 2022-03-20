package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nit.bo.FinanceEmployeeBO;

public class FinanceEmployeeDAOImpl implements IFinanceEmployeeDAO {
	private static final String INSERT_FINANCE_EMPLOYEE = "INSERT INTO BD_FINANCE_EMPLOYEE VALUES(BD_EMPNO_SEQ.CURRVAL,?,?,?,?)";

	@Override
	public boolean insertEmployee(Connection con,FinanceEmployeeBO financeBo) throws SQLException, Exception {
		PreparedStatement ps = null;
		try {		
			//Create PreparedStatement object
			ps = con.prepareStatement(INSERT_FINANCE_EMPLOYEE);
			//Set values to query params
			ps.setString(1, financeBo.getEmpName());
			ps.setString(2, financeBo.getEmpAddrs());
			ps.setString(3, financeBo.getEmpDesg());
			ps.setDouble(4, financeBo.getSalary());
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