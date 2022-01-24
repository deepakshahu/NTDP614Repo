package com.nit.factory.method;

import com.nit.bike.BajajBike;

//FactoryMethodPattern
public abstract class BajajBikeFactory {
	public abstract void painting();
	public abstract void assembling();
	public abstract void engineTest();
	public abstract void roadTest();
	public abstract BajajBike createBike(String type);
	
	public BajajBike orderBike(String type) {
		BajajBike bike = createBike(type);
		painting();
		assembling();
		engineTest();
		roadTest();
		return bike;
	}
}
