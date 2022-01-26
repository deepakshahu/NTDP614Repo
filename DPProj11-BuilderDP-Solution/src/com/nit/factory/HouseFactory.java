package com.nit.factory;

import com.nit.builder.ConcreteHouseBuilder;
import com.nit.builder.HouseBuilder;
import com.nit.builder.IglooHouseBuilder;
import com.nit.builder.WoodenHouseBuilder;
import com.nit.director.CivilEngineer;
import com.nit.product.House;

public class HouseFactory {

	//factory pattern
	public static House getInstance(String type) {
		House house = null;
		HouseBuilder builder = null;
		if(type.equalsIgnoreCase("concrete"))
			builder = new ConcreteHouseBuilder();
		else if(type.equalsIgnoreCase("wooden"))
			builder = new WoodenHouseBuilder();
		else if(type.equalsIgnoreCase("igloo"))
			builder = new IglooHouseBuilder();
		else
			throw new IllegalArgumentException("Invalid house type");
		
		//Create Director object
		CivilEngineer engineer = new CivilEngineer(builder);
		//construct the house/product
		engineer.constructHouse();
		//get house (product)
		house = engineer.getHouse();
		return house;
	}
}
