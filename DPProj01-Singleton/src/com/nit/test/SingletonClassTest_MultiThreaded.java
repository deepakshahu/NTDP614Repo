package com.nit.test;

public class SingletonClassTest_MultiThreaded {

	public static void main(String[] args) {
		//Create threads with data
		TicketBookingOperation operation = new TicketBookingOperation();
		Thread th1 = new Thread(operation);
		Thread th2 = new Thread(operation);
		Thread th3 = new Thread(operation);
		
		//Start Threads
		th1.start();
		th2.start();
		try {
			Thread.sleep(20000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		th3.start();
		
		/*try {
		Class.forName("com.nit.sdp.Printer2");
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
	}
}