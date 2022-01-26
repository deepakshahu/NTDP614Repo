package com.nit.builder;

import com.nit.product.House;

public interface HouseBuilder {
	public void buildBasement();
	public void buildRoofing();
	public void buildStructure();
	public void buildInterior();
	public House createHouse();
}