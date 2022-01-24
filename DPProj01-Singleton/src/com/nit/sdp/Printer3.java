package com.nit.sdp;

public enum Printer3 {
	INSTANCE;  //ENUM Constant -->It is internally 
						//public static Printer3 INSTANCE = new Printer3()
	
	public static Printer3 getInstance() {
		return INSTANCE;
	}
	
	//Business Method
	public void print(String msg) {
		System.out.println("Printing :: "+msg);
	}
	
}
