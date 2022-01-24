package com.nit.test;

import com.nit.comps.Car;
import com.nit.factory.CarFactory;
import com.nit.factory.CarType;

public class CarCustomer2 {

	public static void main(String[] args) {
		
		Car lCar = CarFactory.createCar(CarType.MODEL_LUXURY);
		lCar.drive();
	}
}