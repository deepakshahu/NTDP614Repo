//Target class
package com.nit.comps;

import java.util.Arrays;
import java.util.Random;

public final class ECommerceStore {
	
	//HAS-A property
	private ICourier courier;
	
	public ECommerceStore() {
		System.out.println("ECommerceStore :: 0-param constructor");
	}
	
	//Setter methods to assign the dynamically chosen dependent class object to target class object
	public void setCourier(ICourier courier) {
		System.out.println("ECommerceStore.setCourier()");
		this.courier = courier;
	}
	
	//Business method
	public String shopping(String[] items, double[] prices) {
		//Calculate bill amount
		double billAmt = 0.0;
		for(double price:prices)
			billAmt+=price;
		String billMsg = Arrays.toString(items)+" with prices "+Arrays.toString(prices)+" Bill Amount : "+billAmt;
		//Generate order id
		int oid = new Random().nextInt(1000);
		//Deliver products
		String deliverMsg = courier.deliverOrder(oid);
		return billMsg+"\n"+deliverMsg;
	}
}
