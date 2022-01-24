package com.nit.factory;

import com.nit.bike.BajajBike;
import com.nit.bike.BajajDiscoverBike;
import com.nit.bike.BajajPlatinaBike;
import com.nit.bike.BajajPulsarBike;
import com.nit.factory.method.BajajBikeFactory;

//FactoryPattern2
public class ChennaiBajajFactory extends BajajBikeFactory{
	public BajajBike createBike(String type) {
		BajajBike bike = null;
		if(type.equalsIgnoreCase("pulsar"))
			bike = new BajajPulsarBike();
		else if(type.equalsIgnoreCase("discover"))
			bike = new BajajDiscoverBike();
		else if(type.equalsIgnoreCase("platina"))
			bike = new BajajPlatinaBike();
		else
			throw new IllegalArgumentException("Invalid bike type");
		return bike;
	}

	@Override
	public void painting() {
		System.out.println("ChennaiBajajFactory.painting()");
	}

	@Override
	public void assembling() {
		System.out.println("ChennaiBajajFactory.assembling()");
	}

	@Override
	public void engineTest() {
		System.out.println("ChennaiBajajFactory.engineTest()");
	}

	@Override
	public void roadTest() {
		System.out.println("ChennaiBajajFactory.roadTest()");
	}
}
