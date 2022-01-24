package com.nit.comps;

public class LuxuryCar extends Car{
	
	private String bootspace;
	private String security;
	
	public LuxuryCar() {
		System.out.println("LuxuryCar :: 0-param constructor");
	}

	@Override
	public void assemble() {
		System.out.println("LuxuryCar.assemble()");
	}

	@Override
	public void roadTest() {
		System.out.println("LuxuryCar.roadTest()");
	}

	@Override
	public void drive() {
		System.out.println("LuxuryCar.drive()");
	}
	
}
