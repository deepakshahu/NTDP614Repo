package com.nit.locator;

import java.util.HashMap;
import java.util.Map;

import com.nit.sessionFacade.IStockDetailsFinderSessionFacade;
import com.nit.sessionFacade.StockDetailsFinderSessionFacadeImpl;

public class BSEStockDetailsCompServiceLocator {
	
	private static BSEStockDetailsCompServiceLocator INSTANCE;
	private Map<String,Object> cacheMap = new HashMap<>();
	
	//static factory method
	public static BSEStockDetailsCompServiceLocator getInstance() {
		if(INSTANCE==null)
			INSTANCE = new BSEStockDetailsCompServiceLocator();
		return INSTANCE;
	}
	
	//method having jndi lookup code logic and placing SessionFactory ref in the internal cache
	public IStockDetailsFinderSessionFacade getSessionFacadeCompRef(String jndiName) {
		System.out.println("BSEStockDetailsCompServiceLocator.getSessionFacadeCompRef()");
		if(!cacheMap.containsKey(jndiName)) {
			//here we should actually write jndi lookup code..to get SessionFacade comp ref from jndi registry
			//but we are directly creating object for SessionFacade class
			IStockDetailsFinderSessionFacade facade = new StockDetailsFinderSessionFacadeImpl();
			//keep in SessionFacade comp ref in cache
			cacheMap.put(jndiName, facade);			
		}
		return (IStockDetailsFinderSessionFacade) cacheMap.get(jndiName);
	}
	

}//class