package com.nit.test;

import com.nit.bike.BajajBike;
import com.nit.factory.ChennaiBajajFactory;
import com.nit.factory.method.BajajBikeFactory;

public class SouthCustomer {

	public static void main(String[] args) {
		
		BajajBikeFactory factory = new ChennaiBajajFactory();
		BajajBike bike = factory.orderBike("discover");
		bike.drive();
	}
}