package com.nit.test;

import com.nit.sdp.Printer3;

public class SingletonClassTest1 {

	public static void main(String[] args) {
		/*//Get Singleton java class object
		Printer p1 = Printer.getInstance();
		Printer p2 = Printer.getInstance();
		System.out.println("Hash codes :: "+p1.hashCode()+" "+p2.hashCode());
		System.out.println("p1==p2 ? "+(p1==p2));*/

		/*System.out.println("=========================");
		//Get Singleton java class object
		Printer2 p1 = Printer2.getInstance();
		Printer2 p2 = Printer2.getInstance();
		System.out.println("Hash codes :: "+p1.hashCode()+" "+p2.hashCode());
		System.out.println("p1==p2 ? "+(p1==p2));*/
		
		System.out.println("=========================");
		//Get Singleton java class object
		Printer3 p1 = Printer3.getInstance();
		Printer3 p2 = Printer3.getInstance();
		System.out.println("Hash codes :: "+p1.hashCode()+" "+p2.hashCode());
		System.out.println("p1==p2 ? "+(p1==p2));
	}
}