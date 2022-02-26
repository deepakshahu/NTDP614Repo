package com.nit.dao;

import java.sql.SQLException;

import com.nit.model.Customer;

public interface ICustomerDAO {
	public int insertCustomer(Customer customer) throws SQLException;
}
