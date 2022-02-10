//Factory Pattern
package com.nit.factory;

import java.lang.reflect.Proxy;

import com.nit.proxy.BankServiceProxyHelper;
import com.nit.real.BankServiceImpl;
import com.nit.real.IBankService;

public class BankServiceFactory {
	public static IBankService getInstance(Boolean RBIMonitoring) {
		IBankService service = null;
		if(RBIMonitoring)
			service = (IBankService) Proxy.newProxyInstance(IBankService.class.getClassLoader(), 
					new Class[] {IBankService.class}, new BankServiceProxyHelper());
		else
			service = new BankServiceImpl();
		return service;
	}
}//class