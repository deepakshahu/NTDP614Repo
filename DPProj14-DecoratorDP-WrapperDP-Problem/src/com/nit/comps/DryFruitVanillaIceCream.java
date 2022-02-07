package com.nit.comps;

public class DryFruitVanillaIceCream extends VanillaIceCream {

	@Override
	public void prepare() {
		System.out.println("Preparing Vanilla IceCream");
		addDryFruits();
	}
	
	public void addDryFruits() {
		System.out.println("Adding dry fruits to Vanilla IceCream");
	}
}