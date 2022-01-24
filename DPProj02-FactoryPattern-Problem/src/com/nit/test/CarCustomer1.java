package com.nit.test;

import com.nit.comps.BudgetCar;
import com.nit.comps.Car;

public class CarCustomer1 {

	public static void main(String[] args) {
		
		Car bCar = new BudgetCar();
		bCar.assemble();
		bCar.roadTest();
		bCar.drive();
	}
}