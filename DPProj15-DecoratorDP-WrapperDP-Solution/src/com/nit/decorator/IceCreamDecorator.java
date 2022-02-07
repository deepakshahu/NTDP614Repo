//Abstract Decorator class
package com.nit.decorator;

import com.nit.comp.IceCream;

public abstract class IceCreamDecorator implements IceCream{
	//HAS-A Property
	private IceCream icecream;
	
	public IceCreamDecorator(IceCream icecream) {
		this.icecream=icecream;
	}
	
	@Override
	public void prepare() {
		icecream.prepare();	
	}
}