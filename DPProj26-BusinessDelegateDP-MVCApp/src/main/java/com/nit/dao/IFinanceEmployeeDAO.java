package com.nit.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.nit.bo.FinanceEmployeeBO;

public interface IFinanceEmployeeDAO extends IEmployeeDAO {
	public boolean insertEmployee(Connection con, FinanceEmployeeBO financeBo) throws SQLException, Exception;
}