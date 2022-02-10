package com.nit.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.nit.real.BankServiceImpl;
import com.nit.real.IBankService;

public class BankServiceProxyHelper implements InvocationHandler{
	IBankService real = null;
	public BankServiceProxyHelper() {
		real = new BankServiceImpl();  //real class object
	}

	@Override
	public Object invoke(Object target, Method method, Object[] args) throws Throwable {
		Object retVal = null;
		if(method.getName().equalsIgnoreCase("withdraw")) {
			if(((Float)args[1])<=4000)
				method.invoke(real, args);  //real class logic
			else
				throw new IllegalArgumentException("You cannot withdraw more than Rs.4000 amount");
		}
		return retVal;
	}
}//class