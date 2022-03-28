package com.nit.dispatcher;

import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

public class Dispatcher {
	private static ResourceBundle bundle = null;
	static {
		//get access to properties file
		bundle = ResourceBundle.getBundle("com/nit/config/application");
	}

	public static String mapLVNToPVN(HttpServletRequest req, String lvn) {
		System.out.println("Dispatcher.mapLVNToPVN()");
		//get physical view name based on the given logical view name
		String pvn = bundle.getString(lvn);
		return pvn;
	}
}
