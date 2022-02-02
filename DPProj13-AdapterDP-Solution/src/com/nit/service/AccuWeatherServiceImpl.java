package com.nit.service;

import com.nit.adapter.WeatherReportCompAdapter;

public class AccuWeatherServiceImpl implements IAccuWeatherService {

	@Override
	public String showTemparature(String cityName) {
		//Use adapter class
		WeatherReportCompAdapter adapter = new WeatherReportCompAdapter();
		String tempc = adapter.fetchTemparature(cityName);
		return tempc;
	}
}