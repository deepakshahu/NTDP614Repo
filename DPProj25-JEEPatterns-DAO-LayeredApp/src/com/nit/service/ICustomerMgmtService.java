package com.nit.service;

import java.sql.SQLException;

import com.nit.model.Customer;

public interface ICustomerMgmtService {
	public String registerCustomer(Customer customer) throws SQLException;
}