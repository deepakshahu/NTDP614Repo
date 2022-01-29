//Dependent class
package com.nit.comps;

public final class DHL implements ICourier {

	public DHL() {
		System.out.println("DHL :: 0-param constructor");
	}

	@Override
	public String deliverOrder(int oid) {
		return oid+" order id order products has been delivered by DHL courier service.";
	}

}
