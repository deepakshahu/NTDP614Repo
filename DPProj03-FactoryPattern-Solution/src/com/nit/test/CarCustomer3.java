package com.nit.test;

import com.nit.comps.Car;
import com.nit.factory.CarFactory;

public class CarCustomer3 {

	public static void main(String[] args) {
		
		Car sCar = CarFactory.createCar("sports");
		sCar.drive();
	}
}