package com.nit.test;

import com.nit.comps.Car;
import com.nit.comps.LuxuryCar;

public class CarCustomer2 {

	public static void main(String[] args) {
		
		Car lCar = new LuxuryCar();
		lCar.assemble();
		lCar.roadTest();
		lCar.drive();
	}
}