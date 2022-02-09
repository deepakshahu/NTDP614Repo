package com.nit.factory;

import java.util.HashMap;
import java.util.Map;

import com.nit.comp.Shape;

public class ShapeFactory<T extends Shape> {
	private static Map<String,Shape> cacheMap = new HashMap();

	//Factory pattern with caching logic
	public static <T extends Shape> T getInstance(String type,Class<T> clazz) throws Exception {
		Shape shape = null;
		if(!cacheMap.containsKey(type)) {
			//Keep shape object in the cache or buffer
			cacheMap.put(type, (T) clazz.getDeclaredConstructors()[0].newInstance(null));
		}
		return (T) cacheMap.get(type);
	}//method
}//class