package com.nit.mappings;

import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

import com.nit.command.ICommand;

public class CommandHelper {

	private static ResourceBundle bundle = null;
	static {
		//get access to properties file
		bundle = ResourceBundle.getBundle("com/nit/config/application");
	}

	//static method - mapping method
	public static ICommand mapRequestWithCommand(HttpServletRequest req, String uri) {
		System.out.println("CommandHelper.mapRequestWithCommand()");
		//get Command class name by giving incoming request path 
		String cmdClassName = bundle.getString(uri);
		System.out.println(cmdClassName);
		//use reflection api to create object
		ICommand cmd = null;
		try {
			//load object
			Class clazz = Class.forName(cmdClassName);
			cmd = (ICommand) clazz.getDeclaredConstructors()[0].newInstance();	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return cmd;
	}
}
