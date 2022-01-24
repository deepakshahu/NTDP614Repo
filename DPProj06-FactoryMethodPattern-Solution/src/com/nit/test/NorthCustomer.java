package com.nit.test;

import com.nit.bike.BajajBike;
import com.nit.factory.ChennaiBajajFactory;
import com.nit.factory.NagpurBajajFactory;
import com.nit.factory.method.BajajBikeFactory;

public class NorthCustomer {

	public static void main(String[] args) {
		
		BajajBikeFactory factory = new NagpurBajajFactory();
		BajajBike bike = factory.orderBike("pulsar");
		bike.drive();
	}
}