package com.nit.test;

import com.nit.comps.ButterScotchIceCream;
import com.nit.comps.DryFruitButterScotchIceCream;
import com.nit.comps.DryFruitVanillaIceCream;
import com.nit.comps.HoneyDryFruitVanillaIceCream;
import com.nit.comps.VanillaIceCream;

public class DecoratorDPTest {

	public static void main(String[] args) {
		VanillaIceCream vic = new VanillaIceCream();
		vic.prepare();
		ButterScotchIceCream bsc = new ButterScotchIceCream();
		bsc.prepare();
		DryFruitVanillaIceCream dfvc = new DryFruitVanillaIceCream();
		dfvc.addDryFruits();
		HoneyDryFruitVanillaIceCream hdfvc = new HoneyDryFruitVanillaIceCream();
		hdfvc.addHoney();
		DryFruitButterScotchIceCream dfbsc = new DryFruitButterScotchIceCream();
		dfbsc.addDryFruits();
	}
}