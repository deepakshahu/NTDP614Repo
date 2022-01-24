package com.nit.test;

import com.nit.bike.BajajBike;
import com.nit.factory.ChennaiBajajFactory;

public class SouthCustomer {

	public static void main(String[] args) {
		
		BajajBike bike = ChennaiBajajFactory.createBike("pulsar");
		bike.drive();
	}
}