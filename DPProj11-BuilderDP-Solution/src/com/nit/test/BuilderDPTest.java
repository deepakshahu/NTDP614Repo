package com.nit.test;

import com.nit.factory.HouseFactory;
import com.nit.product.House;

public class BuilderDPTest {

	public static void main(String[] args) {
		//Get Product/House using the factory
		/*House house = HouseFactory.getInstance("igloo");
		System.out.println(house);*/
		System.out.println("--------------------------");
		House house = HouseFactory.getInstance("concrete");
		System.out.println(house);
	}
}