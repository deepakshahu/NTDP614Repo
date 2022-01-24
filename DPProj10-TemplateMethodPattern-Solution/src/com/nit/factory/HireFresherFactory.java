package com.nit.factory;

import com.nit.recruitment.HireDotNetFresher;
import com.nit.recruitment.HireFresher;
import com.nit.recruitment.HireJavaFresher;
import com.nit.recruitment.HireUITechnologiesFresher;

public class HireFresherFactory {
	
	//Static factory method - Factory Pattern
	public static HireFresher getInstance(String type) {
		HireFresher fresher = null;
		if(type.equalsIgnoreCase("java"))
			fresher = new HireJavaFresher();
		else if(type.equalsIgnoreCase("dotNet"))
			fresher = new HireDotNetFresher();
		else if(type.equalsIgnoreCase("ui"))
			fresher = new HireUITechnologiesFresher();
		else
			throw new IllegalArgumentException("Invalid fresher type");
		return fresher;
	}//method
}//class