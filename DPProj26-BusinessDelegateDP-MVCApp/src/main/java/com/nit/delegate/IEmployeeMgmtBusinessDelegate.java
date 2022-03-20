package com.nit.delegate;

import java.sql.SQLException;

import com.nit.vo.EmployeeVO;

public interface IEmployeeMgmtBusinessDelegate {
	
	public String registerEmployee(EmployeeVO vo) throws SQLException, Exception;
}