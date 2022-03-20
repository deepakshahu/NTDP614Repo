package com.nit.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class StockAllDetailsDTO extends StockDetailsDTO {
	private double nextOneYearStockValue;
	private double nextTwoYearStockValue;
	private double nextThreeYearStockValue;
	private double changePercentage;
	private LocalDate verifiedOn;
}
