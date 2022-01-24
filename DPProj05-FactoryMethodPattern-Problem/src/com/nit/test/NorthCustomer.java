package com.nit.test;

import com.nit.bike.BajajBike;
import com.nit.factory.ChennaiBajajFactory;
import com.nit.factory.NagpurBajajFactory;

public class NorthCustomer {

	public static void main(String[] args) {
		
		BajajBike bike = NagpurBajajFactory.createBike("pulsar");
		bike.drive();
	}
}