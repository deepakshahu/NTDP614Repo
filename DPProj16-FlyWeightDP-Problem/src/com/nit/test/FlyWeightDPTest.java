package com.nit.test;

import com.nit.comp.Circle;
import com.nit.comp.Square;

public class FlyWeightDPTest {

	public static void main(String[] args) {
		System.out.println("====Drawing Circle Shape====");
		for(int i=1; i<=500; ++i) {
			Circle circle = new Circle();
			circle.draw(i+10, "red", "dashed");
		}
		
		System.out.println("====Drawing Square Shape====");
		for(int i=1; i<=500; ++i) {
			Square square = new Square();
			square.draw(i+10, "blue", "dashed");
		}
		
	}//main
}//class