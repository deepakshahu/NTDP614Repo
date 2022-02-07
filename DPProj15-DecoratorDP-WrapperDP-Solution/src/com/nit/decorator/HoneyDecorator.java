//Concrete Decorator
package com.nit.decorator;

import com.nit.comp.IceCream;

public class HoneyDecorator extends IceCreamDecorator{

	public HoneyDecorator(IceCream icecream) {
		super(icecream);
	}
	
	@Override
	public void prepare() {
		super.prepare();
		addHoney();
	}
	
	public void addHoney() {
		System.out.println("Adding honey");
	}
}
