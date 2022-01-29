//Dependent class
package com.nit.comps;

public final class BlueDart implements ICourier {

	public BlueDart() {
		System.out.println("BlueDart :: 0-param constructor");
	}

	@Override
	public String deliverOrder(int oid) {
		return oid+" order id order products has been delivered by BlueDart courier service.";
	}

}
