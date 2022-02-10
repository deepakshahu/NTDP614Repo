package com.nit.test;

import java.util.Arrays;

import com.nit.factory.BankServiceFactory;
import com.nit.real.IBankService;

public class ProxyDPTest {

	public static void main(String[] args) {
		//During Demonitization
		try {
			IBankService service = BankServiceFactory.getInstance(true);
			System.out.println("Service object class name :: "+service.getClass().getName()+" "+service.getClass().getSuperclass());
			System.out.println("Implemented interfaces :: "+Arrays.toString(service.getClass().getInterfaces()));
			String result = service.withDraw(133554L, 50000.78f);  //more than 4000
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("===========================================");
		//During Demonitization
		try {
			IBankService service = BankServiceFactory.getInstance(true);
			System.out.println("Service object class name :: "+service.getClass().getName());
			String result = service.withDraw(133554L, 2000.78f);  //less than 4000
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("===========================================");
		//During Normal days
		try {
			IBankService service = BankServiceFactory.getInstance(false);
			System.out.println("Service object class name :: "+service.getClass().getName());
			String result = service.withDraw(133554L, 13000.78f);  //more than 4000
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}//class