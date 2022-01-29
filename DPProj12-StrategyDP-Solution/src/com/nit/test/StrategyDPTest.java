package com.nit.test;

import com.nit.comps.ECommerceStore;
import com.nit.factory.ECommerceStoreFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		
		//Get target class object
		ECommerceStore store = ECommerceStoreFactory.getInstance("blueDart");
		//Invoke the business method
		String resultMsg = store.shopping(new String[] {"Shirt","Hat"}, new double[] {1500,100});
		System.out.println(resultMsg);
	}//main
}//class