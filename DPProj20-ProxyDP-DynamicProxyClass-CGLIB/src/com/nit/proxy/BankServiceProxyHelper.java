package com.nit.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class BankServiceProxyHelper implements MethodInterceptor{

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("BankServiceProxyHelper.intercept() :: Helper for Dynamic Proxy class");
		if(method.getName().equalsIgnoreCase("withdraw")) {
			if(((Float)args[1])<=4000) {
				//Invoke the real method
				Object retVal = proxy.invokeSuper(obj, args);
				return retVal;
			}
			else
				throw new IllegalArgumentException("You can not withdraw more than 4000 in the period of demonitization");
		}
		else {
			Object retVal = proxy.invokeSuper(obj, args);
			return retVal;
		}
	}
}//class