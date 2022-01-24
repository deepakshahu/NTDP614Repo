//Perfect Singleton in Modern Style
package com.nit.sdp;

import com.nit.commons.CommonsUtils;

public class Printer2 extends CommonsUtils{

	private static boolean isInstantiated = false;

	//Private Constructor
	private Printer2() {
		if(isInstantiated)
			throw new RuntimeException("Object is already created");
		else
			isInstantiated=true;
		System.out.println("Printer2 :: 0-param constructor");
	}

	//Static Inner class/Nested Inner class/
	private static class Printer2Inner{
		private static Printer2 INSTANCE = new Printer2();  //Inner class based eager instantiation
		//(From outer class, it is lazy instantiation)
	}

	//Static factory method
	public static Printer2 getInstance() {
		return Printer2Inner.INSTANCE;
	}

	//Solution 2 for cloning problem : throw exception (Best Solution)
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("In this singleton class, cloning is restricted");
	}

	//Solution 1 for Serialization and DeSerialization problem : return instance (Best Solution)
	public Object readResolve() {
		return Printer2Inner.INSTANCE;
	}

	//Business Method
	public void printMessage(String msg) {
		System.out.println(msg);
	}
}
