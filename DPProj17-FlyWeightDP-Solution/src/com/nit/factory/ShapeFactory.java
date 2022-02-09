package com.nit.factory;

import java.util.HashMap;
import java.util.Map;

import com.nit.comp.Circle;
import com.nit.comp.Shape;
import com.nit.comp.Square;

public class ShapeFactory {
	private static Map<String,Shape> cacheMap = new HashMap();

	//Factory pattern with caching logic
	public static Shape getInstance(String type) {
		Shape shape = null;
		if(!cacheMap.containsKey(type)) {
			if(type.equalsIgnoreCase("circle"))
				shape = new Circle();
			else if(type.equalsIgnoreCase("square"))
				shape = new Square();
			else
				throw new IllegalArgumentException("Invalid Shape type");
			//Keep shape object in the cache or buffer
			cacheMap.put(type, shape);
		}
		return cacheMap.get(type);
	}//method
}//class