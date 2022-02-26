package com.nit.service;

import java.sql.SQLException;

import com.nit.dao.CustomerDAOFactory;
import com.nit.dao.ICustomerDAO;
import com.nit.model.Customer;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	
	private ICustomerDAO dao;
	
	public CustomerMgmtServiceImpl() {
		dao = CustomerDAOFactory.getInstance("jdbc");
	}

	@Override
	public String registerCustomer(Customer customer) throws SQLException {
		//GST on billAmt (logic)
		float billAmt = customer.getBillAmt()+(customer.getBillAmt()*0.18f);
		//Use dao
		customer.setBillAmt(billAmt);
		int count = dao.insertCustomer(customer);
		return count==0?"Customer not registered":"Customer is registered";
	}

}
