//Concrete Decorator
package com.nit.decorator;

import com.nit.comp.IceCream;

public class DryFruitDecorator extends IceCreamDecorator{

	public DryFruitDecorator(IceCream icecream) {
		super(icecream);
	}
	
	@Override
	public void prepare() {
		super.prepare();
		addDryFruits();
	}
	
	public void addDryFruits() {
		System.out.println("Adding dryfruits");
	}
}
