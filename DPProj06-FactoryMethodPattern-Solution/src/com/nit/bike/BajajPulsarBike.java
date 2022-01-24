package com.nit.bike;

public class BajajPulsarBike implements BajajBike {
	private String power;

	@Override
	public void drive() {
		System.out.println("BajajPulsarBike.drive()");
	}
}
