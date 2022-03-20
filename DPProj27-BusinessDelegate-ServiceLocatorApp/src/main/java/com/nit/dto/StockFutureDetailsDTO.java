package com.nit.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class StockFutureDetailsDTO implements Serializable {
	
	private double nextOneYearStockValue;
	private double nextTwoYearStockValue;
	private double nextThreeYearStockValue;
	private double changePercentage;
}
