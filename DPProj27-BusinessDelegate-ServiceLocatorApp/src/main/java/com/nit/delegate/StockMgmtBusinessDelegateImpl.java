package com.nit.delegate;

import com.nit.dto.StockAllDetailsDTO;
import com.nit.locator.BSEStockDetailsCompServiceLocator;
import com.nit.sessionFacade.IStockDetailsFinderSessionFacade;
import com.nit.vo.StockAllDetailsVO;

public class StockMgmtBusinessDelegateImpl implements IStockMgmtBusinessDelegate {

	@Override
	public StockAllDetailsVO findStockAllDetailsByStockName(String stockName) throws Exception {
		System.out.println("StockMgmtBusinessDelegateImpl.findStockAllDetailsByStockName()");
		//get ServiceLocator class object
		BSEStockDetailsCompServiceLocator locator = BSEStockDetailsCompServiceLocator.getInstance();
		//Invoke method on locator class object to get SessionFacade ref
		IStockDetailsFinderSessionFacade facade = locator.getSessionFacadeCompRef("bse");
		//Invoke method of SessionFacade class
		StockAllDetailsDTO dto = facade.findAllStockDetailsByStockName(stockName);
		//Convert DTO class object to VO class object
		StockAllDetailsVO vo = new StockAllDetailsVO();
		vo.setStockId(String.valueOf(dto.getStockId()));
		vo.setStockName(dto.getStockName());
		vo.setCompany(dto.getCompany());
		vo.setStockType(dto.getStockType());
		vo.setStockValue(String.valueOf(dto.getStockValue()));
		vo.setListedOn(dto.getListedOn().toString());
		vo.setVerifiedOn(dto.getVerifiedOn().toString());
		vo.setNextOneYearStockValue(String.valueOf(dto.getNextOneYearStockValue()));
		vo.setNextTwoYearStockValue(String.valueOf(dto.getNextTwoYearStockValue()));
		vo.setNextThreeYearStockValue(String.valueOf(dto.getNextThreeYearStockValue()));
		vo.setChangePercentage(String.valueOf(dto.getChangePercentage()));
		return vo;
	}

}
