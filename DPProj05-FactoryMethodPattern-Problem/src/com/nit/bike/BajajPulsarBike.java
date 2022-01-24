package com.nit.bike;

public class BajajPulsarBike implements BajajBike {
	private String power;

	@Override
	public void painting() {
		System.out.println("BajajPulsarBike.painting()");		
	}

	@Override
	public void assembling() {
		System.out.println("BajajPulsarBike.assembling()");
	}

	@Override
	public void engineTest() {
		System.out.println("BajajPulsarBike.engineTest()");
	}

	@Override
	public void roadTest() {
		System.out.println("BajajPulsarBike.roadTest()");
	}

	@Override
	public void drive() {
		System.out.println("BajajPulsarBike.drive()");
	}
}
