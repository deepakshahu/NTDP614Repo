package com.nit.vo;

import lombok.Data;

@Data
public class StockAllDetailsVO	{
	
	private String stockId;
	private String stockName;
	private String stockValue;
	private String company;
	private String stockType;
	private String exchangeName;
	private String listedOn;
	private String nextOneYearStockValue;
	private String nextTwoYearStockValue;
	private String nextThreeYearStockValue;
	private String changePercentage;
	private String verifiedOn;
}
