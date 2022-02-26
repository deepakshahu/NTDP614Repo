package com.nit.controller;

import java.sql.SQLException;

import com.nit.model.Customer;
import com.nit.service.CustomerMgmtServiceImpl;
import com.nit.service.ICustomerMgmtService;

public class CustomerOperationsController {
	
	private ICustomerMgmtService service;
	
	public CustomerOperationsController() {
		service = new CustomerMgmtServiceImpl();
	}
	
	public String processCustomerForRegistration(Customer customer) throws SQLException{
		//Use service
		String resultMsg = service.registerCustomer(customer);
		return resultMsg;
	}

}
