package com.nit.test;

import com.nit.comps.Car;
import com.nit.comps.SportsCar;

public class CarCustomer3 {

	public static void main(String[] args) {
		
		Car sCar = new SportsCar();
		sCar.assemble();
		sCar.roadTest();
		sCar.drive();
	}
}