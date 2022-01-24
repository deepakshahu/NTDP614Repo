package com.nit.test;

import java.lang.reflect.Constructor;

import com.nit.sdp.Printer2;
import com.nit.sdp.Printer3;

public class SingletonClassReflectionAPITest {

	public static void main(String[] args) {

		/*try {
			//Load the singleton java class
			Class c = Class.forName("com.nit.sdp.Printer");  //better bcoz we can take arguments at run time
			//or
			//Class c = Printer.class;

			//Get all the declared constructors of the class
			Constructor cons[] = c.getDeclaredConstructors();

			//Get access to private constructor(if any)
			cons[0].setAccessible(true);

			//Create objects for singleton java class using the accessed private constructor
			Printer p = Printer.getInstance();  //using static factory method
			Printer p1 = (Printer) cons[0].newInstance();
			Printer p2 = (Printer) cons[0].newInstance();
			System.out.println(p.hashCode()+" "+p1.hashCode()+" "+p2.hashCode());
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}*/

		/*System.out.println("========================");
		
		try {
			//Load the singleton java class
			Class c = Class.forName("com.nit.sdp.Printer2");  //better bcoz we can take arguments at run time
			//or
			//Class c = Printer.class;
		
			//Get all the declared constructors of the class
			Constructor cons[] = c.getDeclaredConstructors();
		
			//Get access to private constructor(if any)
			cons[0].setAccessible(true);
		
			//Create objects for singleton java class using the accessed private constructor
			Printer2 p = Printer2.getInstance();  //using static factory method
			Printer2 p1 = (Printer2) cons[0].newInstance();
			Printer2 p2 = (Printer2) cons[0].newInstance();
			System.out.println(p.hashCode()+" "+p1.hashCode()+" "+p2.hashCode());
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}*/

		System.out.println("========================");

		try {
			//Load the singleton java class
			Class c = Class.forName("com.nit.sdp.Printer3");  //better bcoz we can take arguments at run time
			//or
			//Class c = Printer.class;

			//Get all the declared constructors of the class
			Constructor cons[] = c.getDeclaredConstructors();

			//Get access to private constructor(if any)
			cons[0].setAccessible(true);

			//Create objects for singleton java class using the accessed private constructor
			Printer3 p = Printer3.getInstance();  //using static factory method
			Printer3 p1 = (Printer3) cons[0].newInstance();
			Printer3 p2 = (Printer3) cons[0].newInstance();
			System.out.println(p.hashCode()+" "+p1.hashCode()+" "+p2.hashCode());
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}//class