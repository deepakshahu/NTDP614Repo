package com.nit.comps;

public class HoneyDryFruitVanillaIceCream extends DryFruitVanillaIceCream {

	@Override
	public void prepare() {
		super.prepare();
		addHoney();
	}
	
	public void addHoney() {
		System.out.println("Adding Honey to Dry Fruit Vanilla IceCream");
	}
}