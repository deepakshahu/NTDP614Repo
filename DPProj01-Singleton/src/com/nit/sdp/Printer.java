//Perfect Singleton in Legacy Style
package com.nit.sdp;

import com.nit.commons.CommonsUtils;

public class Printer extends CommonsUtils{

	private static final long serialVersionUID = 1L;
	int a = 10;
	//Private static reference variable
	private static Printer INSTANCE;
	private static boolean isInstantiated = false;

	//Private Constructor
	private Printer() {
		if(isInstantiated)
			throw new RuntimeException("Object is already created");
		else
			isInstantiated=true;
		System.out.println("Printer :: 0-param constructor");
	}

	/*//public static factory method having singleton logic
	public static Printer getInstance() {
		if(INSTANCE==null)
			INSTANCE = new Printer();
		return INSTANCE;
	}*/

	/*//public synchronized static factory method having singleton logic
		public synchronized static Printer getInstance() {
			if(INSTANCE==null) {
				try {
					Thread.sleep(10000);
				}//try
				catch(Exception e) {
					e.printStackTrace();
				}//catch
				INSTANCE = new Printer();
			}//if
			return INSTANCE;
		}//method
	 */	

	/*//public static factory method having singleton logic in synchronized block
	public static Printer getInstance() {
		//Singleton logic
		synchronized (Printer.class) {  //class level locking(static properties will be locked)
			if(INSTANCE==null) {
				try {
					Thread.sleep(10000);
				}//try
				catch(Exception e) {
					e.printStackTrace();
				}//catch
				INSTANCE = new Printer();
			}//if
		}//synchronized
		return INSTANCE;
	}//method
	 */

	//public static factory method having singleton logic in synchronized block using double null check
	public static Printer getInstance() {
		if(INSTANCE==null) {  //1st null check
			//Singleton logic
			synchronized (Printer.class) {  //class level locking(static properties will be locked)
				if(INSTANCE==null) {  //2nd null check
					INSTANCE = new Printer();
				}//2nd if
			}//synchronized
		}//1st if
		return INSTANCE;
	}//method

	//Solution 1 for cloning problem : return instance
	/*@Override
	public Object clone() throws CloneNotSupportedException {
		return INSTANCE;
	}*/

	//Solution 2 for cloning problem : throw exception (Best Solution)
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("In this singleton class, cloning is restricted");
	}

	//Solution 1 for Serialization and DeSerialization problem : return instance (Best Solution)
	public Object readResolve() {
		return INSTANCE;
	}

	//Solution 2 for Serialization and DeSerialization problem : throw Exception
	/*public Object readResolve() {
		throw new IllegalArgumentException("DeSerialization is not allowed on this class");
	}*/

	//Business Method
	public void printMessage(String msg) {
		System.out.println(msg);
	}
}
