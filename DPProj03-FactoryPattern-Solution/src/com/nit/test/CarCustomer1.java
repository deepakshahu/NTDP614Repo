package com.nit.test;

import com.nit.comps.Car;
import com.nit.factory.CarFactory;

public class CarCustomer1 {

	public static void main(String[] args) {
		
		Car bCar = CarFactory.createCar("budget");
		bCar.drive();
	}
}