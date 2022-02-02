package com.nit.external;

import java.util.Random;

public class WeatherReportCompImpl implements IWeatherReportComp {

	@Override
	public float getTemparature(int cityCode) {
		//Gives temparature in fahrenheit degress
		if(cityCode==022)  //Mumbai STD code, India
			return new Random().nextFloat()*100.0f;
		else if(cityCode==040)  //Hyderabad city code
			return new Random().nextFloat()*100.0f;
		else if(cityCode==020)  //Pune city code
			return new Random().nextFloat()*100.0f;
		else
			throw new IllegalArgumentException("Invalid city code");
	}//method
}//class