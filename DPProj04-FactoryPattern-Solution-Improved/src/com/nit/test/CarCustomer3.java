package com.nit.test;

import com.nit.comps.Car;
import com.nit.factory.CarFactory;
import com.nit.factory.CarType;

public class CarCustomer3 {

	public static void main(String[] args) {
		
		Car sCar = CarFactory.createCar(CarType.MODEL_SPORTS);
		sCar.drive();
	}
}