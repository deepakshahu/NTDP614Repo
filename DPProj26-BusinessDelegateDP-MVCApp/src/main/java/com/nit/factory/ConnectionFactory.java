package com.nit.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionFactory {

	private static String dsJndiName;

	static {
		try {
			ResourceBundle bundle = ResourceBundle.getBundle("com/nit/commons/jdbc");
			dsJndiName = bundle.getString("datasource.jndi");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//static

	public static Connection getPooledJdbcConnection() throws NamingException, SQLException {
		try {
			//Create initialContext object
			InitialContext context = new InitialContext();
			//Get DataSource object from jndi registry
			DataSource ds = (DataSource) context.lookup(dsJndiName);
			//Get Pooled jdbc con object
			Connection con = ds.getConnection();
			return con;
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;  //exception re=throwing
		}
		catch(NamingException ne) {
			ne.printStackTrace();
			throw ne;  //exception re=throwing
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;  //exception re=throwing
		}
	}

}//class