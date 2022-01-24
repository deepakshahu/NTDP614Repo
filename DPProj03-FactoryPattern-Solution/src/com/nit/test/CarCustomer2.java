package com.nit.test;

import com.nit.comps.Car;
import com.nit.factory.CarFactory;

public class CarCustomer2 {

	public static void main(String[] args) {
		
		Car lCar = CarFactory.createCar("luxury");
		lCar.drive();
	}
}