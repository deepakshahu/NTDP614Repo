package com.nit.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class StockDetailsDTO extends StockBaseDetailsDTO {
	
	private String stockType;
	private String exchangeName;
	private LocalDate listedOn;
}
