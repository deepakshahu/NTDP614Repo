package com.nit.test;

import com.nit.service.AccuWeatherServiceImpl;
import com.nit.service.IAccuWeatherService;

public class AdapterDPTest {

	public static void main(String[] args) {
		
		//Use AccuWeather service
		IAccuWeatherService service = new AccuWeatherServiceImpl();
		String result = service.showTemparature("hyderabad");
		System.out.println("Temparature :: "+result);
	}//main
}//class