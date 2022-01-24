//Singleton java class with minimum standards
package com.nit.sdp;

public class Printer1 {

	//Private static reference variable
	private static Printer1 INSTANCE = new Printer1();

	//Private Constructor
	private Printer1() {
		System.out.println("Printer1 :: 0-param constructor");
	}

	//Static factory method
	public static Printer1 getInstance() {
		return INSTANCE;
	}
	
	//Business Method
	public void printMessage(String msg) {
		System.out.println(msg);
	}
}
