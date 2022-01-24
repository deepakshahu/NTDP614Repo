package com.nit.test;

import com.nit.sdp.Printer;
import com.nit.sdp.Printer1;
import com.nit.sdp.Printer2;
import com.nit.sdp.Printer3;

public class TicketBookingOperation implements Runnable {

	@Override
	public void run() {
		System.out.println("TicketBookingOperation.run()");
		//Printer p = Printer.getInstance();
		//Printer1 p = Printer1.getInstance();
		//Printer2 p = Printer2.getInstance();
		Printer3 p = Printer3.getInstance();
		System.out.println(p.hashCode());
	}
}