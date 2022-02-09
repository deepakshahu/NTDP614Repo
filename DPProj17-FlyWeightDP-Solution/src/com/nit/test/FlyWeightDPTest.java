package com.nit.test;

import com.nit.comp.Circle;
import com.nit.comp.Square;
import com.nit.factory.ShapeFactory;

public class FlyWeightDPTest {

	public static void main(String[] args) {
		System.out.println("====Drawing Circle Shapes====");
		for(int i=1; i<=500; ++i) {
			Circle circle = (Circle) ShapeFactory.getInstance("circle");
			circle.draw(i+10, "red", "dashed");
		}
		
		System.out.println("====Drawing Square Shapes====");
		for(int i=1; i<=500; ++i) {
			Square square = (Square) ShapeFactory.getInstance("square");
			square.draw(i+10, "blue", "dashed");
		}
		
	}//main
}//class