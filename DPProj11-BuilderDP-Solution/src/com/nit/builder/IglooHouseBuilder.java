package com.nit.builder;

import com.nit.product.House;
import com.nit.product.IceBasement;
import com.nit.product.IceCarvingInterior;
import com.nit.product.IceRoofing;
import com.nit.product.IceStructure;

public class IglooHouseBuilder implements HouseBuilder {
	private House house;
	
	public IglooHouseBuilder() {
		System.out.println("IglooHouseBuilder :: 0-param constructor");
		house = new House();
	}

	@Override
	public void buildBasement() {
		System.out.println("IglooHouseBuilder.buildBasement()");
		house.setBasement(new IceBasement());
	}

	@Override
	public void buildRoofing() {
		System.out.println("IglooHouseBuilder.buildRoofing()");
		house.setRoofing(new IceRoofing());
	}

	@Override
	public void buildStructure() {
		System.out.println("IglooHouseBuilder.buildStructure()");
		house.setStructure(new IceStructure());
	}

	@Override
	public void buildInterior() {
		System.out.println("IglooHouseBuilder.buildInterior()");
		house.setInterior(new IceCarvingInterior());
	}

	@Override
	public House createHouse() {
		System.out.println("IglooHouseBuilder.createHouse()");
		return house;
	}

}
