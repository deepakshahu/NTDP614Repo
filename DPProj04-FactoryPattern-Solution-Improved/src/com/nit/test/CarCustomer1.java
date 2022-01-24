package com.nit.test;

import com.nit.comps.Car;
import com.nit.factory.CarFactory;
import com.nit.factory.CarType;

public class CarCustomer1 {

	public static void main(String[] args) {
		
		Car bCar = CarFactory.createCar(CarType.MODEL_BUDGET);
		bCar.drive();
	}
}