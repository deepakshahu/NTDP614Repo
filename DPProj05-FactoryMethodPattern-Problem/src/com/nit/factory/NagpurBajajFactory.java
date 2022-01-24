package com.nit.factory;

import com.nit.bike.BajajBike;
import com.nit.bike.BajajDiscoverBike;
import com.nit.bike.BajajPlatinaBike;
import com.nit.bike.BajajPulsarBike;

//FactoryPattern1
public class NagpurBajajFactory {
	public static BajajBike createBike(String type) {
		BajajBike bike = null;
		if(type.equalsIgnoreCase("pulsar"))
			bike = new BajajPulsarBike();
		else if(type.equalsIgnoreCase("discover"))
			bike = new BajajDiscoverBike();
		else if(type.equalsIgnoreCase("platina"))
			bike = new BajajPlatinaBike();
		else
			throw new IllegalArgumentException("Invalid bike type");
		bike.assembling();
		bike.painting();
		bike.engineTest();
		return bike;
	}
}
