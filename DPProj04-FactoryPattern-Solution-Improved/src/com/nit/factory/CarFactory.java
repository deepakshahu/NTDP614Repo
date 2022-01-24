package com.nit.factory;

import com.nit.comps.BudgetCar;
import com.nit.comps.Car;
import com.nit.comps.LuxuryCar;
import com.nit.comps.SportsCar;

//FactoryPattern
public class CarFactory {
	
	//Static factory method
	public static Car createCar(String type) {
		Car car = null;
		if(type.equalsIgnoreCase(CarType.MODEL_BUDGET))
			car = new BudgetCar();
		else if(type.equalsIgnoreCase(CarType.MODEL_LUXURY))
			car = new LuxuryCar();
		else if(type.equalsIgnoreCase(CarType.MODEL_SPORTS))
			car = new SportsCar();
		else
			throw new IllegalArgumentException("Invalid Car type");
		car.assemble();
		car.roadTest();
		return car;
		}//method
}//class