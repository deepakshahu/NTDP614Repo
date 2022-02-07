//Concrete Decorator
package com.nit.decorator;

import com.nit.comp.IceCream;

public class ChocoChipsDecorator extends IceCreamDecorator{

	public ChocoChipsDecorator(IceCream icecream) {
		super(icecream);
	}
	
	@Override
	public void prepare() {
		super.prepare();
		addChocoChips();
	}
	
	public void addChocoChips() {
		System.out.println("Adding choco chips");
	}
}
