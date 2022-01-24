package com.nit.bike;

public class BajajDiscoverBike implements BajajBike {
	private String mileage;
	
	@Override
	public void drive() {
		System.out.println("BajajDiscoverBike.drive()");
	}
}
