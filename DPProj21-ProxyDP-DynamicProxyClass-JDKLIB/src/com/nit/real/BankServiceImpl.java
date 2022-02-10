//Real class
package com.nit.real;

public final class BankServiceImpl implements IBankService {

	@Override
	public String withDraw(long acno, float amount) {
		System.out.println("BankServiceImpl.withDraw() :: Real class");
		return "withdrawing amount :: "+amount+" from "+acno;
	}

}
