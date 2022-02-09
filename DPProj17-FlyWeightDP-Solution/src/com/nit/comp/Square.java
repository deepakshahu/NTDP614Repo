package com.nit.comp;

public class Square implements Shape {
	private String label;  //intrinsic data
	public Square() {
		System.out.println("Square :: 0-param constructor");
		label="Square";
	}

	@Override
	public void draw(int sideLength, String fillColor, String lineStyle) {  //extrinsic data
		System.out.println("Drawing Square with side length :: "+sideLength+" having fillColor :: "+fillColor+" and line style :: "+lineStyle);
	}
	
}