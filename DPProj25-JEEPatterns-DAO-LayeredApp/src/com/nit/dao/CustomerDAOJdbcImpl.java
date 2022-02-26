package com.nit.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.nit.factory.ConnectionFactory;
import com.nit.model.Customer;

public class CustomerDAOJdbcImpl implements ICustomerDAO {
	private static final String INSERT_CUSTOMER_QUERY = "INSERT INTO DAO_CUSTOMER VALUES(CUST_ID_SEQ.NEXTVAL,?,?,?)";
	private static Properties props;

	static {
		//Load properties file content into java.util.Properties class object
		try {
			InputStream is = new FileInputStream("src/com/nit/commons/jdbc.properties");
			props = new Properties();
			props.load(is);  //method does actual work
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//static

	@Override
	public int insertCustomer(Customer customer) throws SQLException {
		int result = 0;
		try(
				//get Connection from ConnectionFactory
				Connection con = ConnectionFactory.getConnection(props.getProperty("jdbc.url"),props.getProperty("jdbc.username"), props.getProperty("jdbc.password"));

				//Create PreparedStatement object
				PreparedStatement ps = con.prepareStatement(INSERT_CUSTOMER_QUERY)){

			//Set values to query parameters
			ps.setString(1, customer.getCname());
			ps.setString(2, customer.getCadd());
			ps.setFloat(3, customer.getBillAmt());

			//Execute the query
			result = ps.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;  //exception re-throwing
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;  //exception re-throwing
		}
		return result;

	}//method
}//class