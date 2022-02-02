//Adapter class
package com.nit.adapter;

import com.nit.external.IWeatherReportComp;
import com.nit.external.WeatherReportCompImpl;

public class WeatherReportCompAdapter {

	public String fetchTemparature(String cityName) {
		//Convert city name to city code (Adapter logic)
		int cityCode = 0;
		if(cityName.equalsIgnoreCase("mumbai"))
			cityCode=022;
		else if(cityName.equalsIgnoreCase("hyderabad"))
			cityCode=040;
		else if(cityName.equalsIgnoreCase("pune"))
			cityCode=020;
		else
			return "City not found in the list";
		
		//Use external component service
		IWeatherReportComp comp = new WeatherReportCompImpl();
		float tempf = comp.getTemparature(cityCode);
		//Convert fahrenheit degree to celsius degrees
		float tempc = 5/9.0f*(tempf-32.0f);
		return tempc+" celsius degrees";
	}
}