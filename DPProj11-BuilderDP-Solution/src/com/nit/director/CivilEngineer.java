package com.nit.director;

import com.nit.builder.HouseBuilder;
import com.nit.product.House;

public class CivilEngineer {
	private HouseBuilder builder;
	
	public CivilEngineer(HouseBuilder builder) {
		System.out.println("CivilEngineer :: 1-param constuctor");
		this.builder = builder;
	}
	
	//Method containing logic of house construction
	public void constructHouse() {
		System.out.println("CivilEngineer.constructHouse()");
		builder.buildBasement();
		builder.buildStructure();
		builder.buildRoofing();
		builder.buildInterior();
	}
	
	//Method giving product
	public House getHouse() {
		System.out.println("CivilEngineer.getHouse()");
		return builder.createHouse();
	}
}
