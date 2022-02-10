//Real class
package com.nit.real;

public class BankServiceImpl {

	public String withDraw(long acno, float amount) {
		System.out.println("BankServiceImpl.withDraw() :: Real class");
		return "withdrawing amount :: "+amount+" from "+acno;
	}

}
