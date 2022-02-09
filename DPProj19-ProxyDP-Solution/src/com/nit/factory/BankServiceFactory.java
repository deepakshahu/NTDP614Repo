//Factory Pattern
package com.nit.factory;

import com.nit.proxy.BankServiceProxy;
import com.nit.real.BankServiceImpl;
import com.nit.real.IBankService;

public class BankServiceFactory {
	public static IBankService getInstance(Boolean RBIMonitoring) {
		IBankService service = null;
		if(RBIMonitoring)
			service = new BankServiceProxy();
		else
			service = new BankServiceImpl();
		return service;
	}
}//class