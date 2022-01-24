package com.nit.test;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import com.nit.sdp.Printer;

public class SingletonClassTestUsingClassLoader {

	public static void main(String[] args) {

		/*//Problem Code
		try {
			//Object creation using Application ClassLoader
			System.out.println("==========Using Application ClassLoader===========");
			//Printer p = Printer.getInstance();
			//Printer2 p = Printer2.getInstance();
			Printer3 p = Printer3.getInstance();
			System.out.println("------------------------------------");

			//Object creation using Custom ClassLoader
			System.out.println("==========Using URLClassLoader(readymade Custom ClassLoader===========");
			//Create the ClassLoader using URLClassLoader
			URLClassLoader loader = new URLClassLoader(new URL[] {new URL("file:/E:/Workspaces/DesignPatterns/DPProj1.jar")}, null);  //null for no parent class loader

			//Load the specific class
			//Class<?> clazz = loader.loadClass("com.nit.sdp.Printer");
			//Class<?> clazz = loader.loadClass("com.nit.sdp.Printer2");
			Class<?> clazz = loader.loadClass("com.nit.sdp.Printer3");

			//Get access to getInstance() method of the loaded class
			Method method = clazz.getDeclaredMethod("getInstance", new Class[] {});

			//Invoke the method
			Object obj = method.invoke(null);  //null for no args to pass
			System.out.println("Object hashcode :: "+obj.hashCode()+" Printer hashcode :: "+p.hashCode());
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/

		//Solution Code
		try {
			//Object creation using Application ClassLoader
			System.out.println("==========Using Application ClassLoader===========");
			Printer p = Printer.getInstance();
			//Printer2 p = Printer2.getInstance();
			//Printer3 p = Printer3.getInstance();
			System.out.println("Class Loader :: "+p.getClass().getClassLoader());
			System.out.println("------------------------------------");

			//Object creation using Custom ClassLoader
			System.out.println("==========Using URLClassLoader(readymade Custom ClassLoader)===========");
			//Create the ClassLoader using URLClassLoader
			URLClassLoader loader = new URLClassLoader(new URL[] {new URL("file:/E:/Workspaces/DesignPatterns/DPProj1.jar")}, p.getClass().getClassLoader());  //parent class loader

			//Load the specific class
			Class<?> clazz = loader.loadClass("com.nit.sdp.Printer");
			//Class<?> clazz = loader.loadClass("com.nit.sdp.Printer2");
			//Class<?> clazz = loader.loadClass("com.nit.sdp.Printer3");

			//Get access to getInstance() method of the loaded class
			Method method = clazz.getDeclaredMethod("getInstance", new Class[] {});

			//Invoke the method
			Object obj = method.invoke(null);  //null for no args to pass
			System.out.println("Object hashcode :: "+obj.hashCode()+" Printer hashcode :: "+p.hashCode());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}//class