package com.nit.factory;

import com.nit.comps.BlueDart;
import com.nit.comps.DHL;
import com.nit.comps.ECommerceStore;
import com.nit.comps.ICourier;

public class ECommerceStoreFactory {
	
	public static ECommerceStore getInstance(String courierType) {
		ICourier courier = null;
		if(courierType.equalsIgnoreCase("blueDart"))
			courier = new BlueDart();
		else if(courierType.equalsIgnoreCase("dhl"))
			courier = new DHL();
		else
			throw new IllegalArgumentException("Invalid courier type");
		//Create target class object
		ECommerceStore store = new ECommerceStore();
		//Assign dependent class object
		store.setCourier(courier);
		return store;
	}
}