package com.nit.sessionFacade;

import com.nit.dto.StockAllDetailsDTO;

public interface IStockDetailsFinderSessionFacade {
	public StockAllDetailsDTO findAllStockDetailsByStockName(String stockName);
}
