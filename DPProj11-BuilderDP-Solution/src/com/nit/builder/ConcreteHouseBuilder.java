package com.nit.builder;

import com.nit.product.ConcreteBasement;
import com.nit.product.ConcreteRoofing;
import com.nit.product.ConcreteStructure;
import com.nit.product.GlassInterior;
import com.nit.product.House;

public class ConcreteHouseBuilder implements HouseBuilder {
	private House house;
	
	public ConcreteHouseBuilder() {
		System.out.println("ConcreteHouseBuilder :: 0-param constructor");
		house = new House();
	}

	@Override
	public void buildBasement() {
		System.out.println("ConcreteHouseBuilder.buildBasement()");
		house.setBasement(new ConcreteBasement());
	}

	@Override
	public void buildRoofing() {
		System.out.println("ConcreteHouseBuilder.buildRoofing()");
		house.setRoofing(new ConcreteRoofing());
	}

	@Override
	public void buildStructure() {
		System.out.println("ConcreteHouseBuilder.buildStructure()");
		house.setStructure(new ConcreteStructure());
	}

	@Override
	public void buildInterior() {
		System.out.println("ConcreteHouseBuilder.buildInterior()");
		house.setInterior(new GlassInterior());
	}

	@Override
	public House createHouse() {
		System.out.println("ConcreteHouseBuilder.createHouse()");
		return house;
	}

}
