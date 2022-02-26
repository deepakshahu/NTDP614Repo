package com.nit.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.nit.controller.CustomerOperationsController;
import com.nit.model.Customer;

public class DAODPTest {

	public static void main(String[] args) {
		//Gather details from end-user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer name :: ");
		String name = sc.next();
		System.out.print("Enter Customer Address :: ");
		String addrs = sc.next();
		System.out.print("Enter Customer Bill Amount :: ");
		float amount = sc.nextFloat();
		
		//Create Customer class object having data collected from end user
		Customer cust = new Customer();
		cust.setCname(name);
		cust.setCadd(addrs);
		cust.setBillAmt(amount);
		
		//Create Controller class object
		CustomerOperationsController controller = new CustomerOperationsController();
		
		//Invoke the method
		try {
			String resultMsg = controller.processCustomerForRegistration(cust);
			System.out.println(resultMsg);
		}
		catch(SQLException se) {
			System.out.println(se.getMessage()+" problem is raised");
			se.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+" problem is raised");
			e.printStackTrace();
		}
		
	}//main
}//class