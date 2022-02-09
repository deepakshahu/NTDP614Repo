//Proxy class
package com.nit.proxy;

import com.nit.real.BankServiceImpl;
import com.nit.real.IBankService;

public class BankServiceProxy implements IBankService {
	
	private IBankService real = null;
	
	public BankServiceProxy() {
		real = new BankServiceImpl();  //Object for real class
	}

	@Override
	public String withDraw(long acno, float amount) {
		System.out.println("BankServiceProxy.withDraw() :: Proxy class");
		String result = null;
		if(amount<=4000)
			result = real.withDraw(acno, amount);
		else
			throw new IllegalArgumentException("You cannot withdraw more than 4000 during the demonitization");
		return result;
	}

}
