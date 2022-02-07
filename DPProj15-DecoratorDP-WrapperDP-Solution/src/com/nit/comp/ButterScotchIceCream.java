//Concrete Component class
package com.nit.comp;

public class ButterScotchIceCream implements IceCream {

	@Override
	public void prepare() {
		System.out.println("ButterScotchIceCream :: Preparing ButterScotch Ice-Cream");
	}
}