package com.nit.ext3;

import com.nit.dto.StockDetailsDTO;
import com.nit.dto.StockFutureDetailsDTO;

public interface IBSEStockFutureValueFinder {
	public StockFutureDetailsDTO findStockFutureDetailsByStockName(StockDetailsDTO detailsDTO);
}
