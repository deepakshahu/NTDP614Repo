package com.nit.bike;

public class BajajPlatinaBike implements BajajBike {
	private float price;

	@Override
	public void drive() {
		System.out.println("BajajPlatinaBike.drive()");
	}
}
