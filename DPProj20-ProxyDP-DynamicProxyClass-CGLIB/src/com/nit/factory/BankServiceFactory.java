//Factory Pattern
package com.nit.factory;

import com.nit.proxy.BankServiceProxyHelper;
import com.nit.real.BankServiceImpl;

import net.sf.cglib.proxy.Enhancer;

public class BankServiceFactory {
	
	public static BankServiceImpl getInstance(boolean RBIMonitoring) {
		BankServiceImpl service = null;
		if(RBIMonitoring)
			service = (BankServiceImpl) Enhancer.create(BankServiceImpl.class, new BankServiceProxyHelper());  //generates InMemory Proxy class
		else
			service = new BankServiceImpl();  //real object
		return service;
	}//method
}//class