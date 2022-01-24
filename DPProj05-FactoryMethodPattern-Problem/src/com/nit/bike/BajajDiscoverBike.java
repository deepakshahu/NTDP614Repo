package com.nit.bike;

public class BajajDiscoverBike implements BajajBike {
	private String mileage;

	@Override
	public void painting() {
		System.out.println("BajajDiscoverBike.painting()");		
	}

	@Override
	public void assembling() {
		System.out.println("BajajDiscoverBike.assembling()");
	}

	@Override
	public void engineTest() {
		System.out.println("BajajDiscoverBike.engineTest()");
	}

	@Override
	public void roadTest() {
		System.out.println("BajajDiscoverBike.roadTest()");
	}

	@Override
	public void drive() {
		System.out.println("BajajDiscoverBike.drive()");
	}
}
