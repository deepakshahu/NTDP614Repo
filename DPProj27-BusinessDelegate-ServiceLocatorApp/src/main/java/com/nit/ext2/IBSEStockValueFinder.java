package com.nit.ext2;

import com.nit.dto.StockDetailsDTO;

public interface IBSEStockValueFinder {
	public StockDetailsDTO findStockDetailsById(long stockId);
}
