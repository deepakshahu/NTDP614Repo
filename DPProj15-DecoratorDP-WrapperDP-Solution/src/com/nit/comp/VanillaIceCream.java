//Concrete Component class
package com.nit.comp;

public class VanillaIceCream implements IceCream {

	@Override
	public void prepare() {
		System.out.println("VanillaIceCream :: Preparing Vanilla Ice-Cream");
	}
}