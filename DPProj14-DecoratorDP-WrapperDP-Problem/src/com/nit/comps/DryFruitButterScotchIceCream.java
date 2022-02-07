package com.nit.comps;

public class DryFruitButterScotchIceCream extends ButterScotchIceCream {

	@Override
	public void prepare() {
		System.out.println("Preparing ButterScotch IceCream");
	}
	
	public void addDryFruits() {
		System.out.println("Adding dry fruits to ButterScotch IceCream");
	}
}