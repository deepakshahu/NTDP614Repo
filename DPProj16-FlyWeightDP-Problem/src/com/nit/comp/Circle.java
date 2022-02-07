package com.nit.comp;

public class Circle implements Shape {
	private String label;  //intrinsic data
	public Circle() {
		System.out.println("Circle :: 0-param constructor");
		label="Circle";
	}

	@Override
	public void draw(int radius, String fillColor, String lineStyle) {  //extrinsic data
		System.out.println("Drawing Circle with radius :: "+radius+" having fillColor :: "+fillColor+" and line style :: "+lineStyle);
	}
	
}