package com.nit.test;

import com.nit.comp.IceCream;
import com.nit.comp.VanillaIceCream;
import com.nit.decorator.ChocoChipsDecorator;
import com.nit.decorator.DryFruitDecorator;
import com.nit.decorator.HoneyDecorator;

public class DecoratorDPTest {

	public static void main(String[] args) {
		System.out.println("======== Case1: Eating plain Vanilla ice-cream ========");
		IceCream cream = new VanillaIceCream();
		cream.prepare();

		System.out.println("======== Case2: Eating DryFruit Vanilla ice-cream ========");
		IceCream cream1 = new DryFruitDecorator(new VanillaIceCream());
		cream1.prepare();

		System.out.println("======== Case3: Eating DryFruit, Honey, ChocoChips Vanilla ice-cream ========");
		IceCream cream2 = new ChocoChipsDecorator(new HoneyDecorator(new DryFruitDecorator(new VanillaIceCream())));
		cream2.prepare();

	}
}