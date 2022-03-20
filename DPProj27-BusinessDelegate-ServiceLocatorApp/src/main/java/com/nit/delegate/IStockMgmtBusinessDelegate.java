package com.nit.delegate;

import com.nit.vo.StockAllDetailsVO;

public interface IStockMgmtBusinessDelegate {
	
	public StockAllDetailsVO findStockAllDetailsByStockName(String stockName) throws Exception;
}
