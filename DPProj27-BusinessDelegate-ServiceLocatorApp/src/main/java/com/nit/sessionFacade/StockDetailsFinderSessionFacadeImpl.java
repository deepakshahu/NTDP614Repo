package com.nit.sessionFacade;

import java.time.LocalDate;

import com.nit.dto.StockAllDetailsDTO;
import com.nit.dto.StockDetailsDTO;
import com.nit.dto.StockFutureDetailsDTO;
import com.nit.ext1.BSEStockIdFinderImpl;
import com.nit.ext1.IBSEStockIdFinder;
import com.nit.ext2.BSEStockValueFinderImpl;
import com.nit.ext2.IBSEStockValueFinder;
import com.nit.ext3.BSEStockFutureValueFinderImpl;
import com.nit.ext3.IBSEStockFutureValueFinder;

public class StockDetailsFinderSessionFacadeImpl implements IStockDetailsFinderSessionFacade {

	@Override
	public StockAllDetailsDTO findAllStockDetailsByStockName(String stockName) {
		System.out.println("StockDetailsFinderSessionFacadeImpl.findAllStockDetailsByStockName()");
		//Invoke 3 extends service comps locally
		//extComp1
		IBSEStockIdFinder extComp1 = new BSEStockIdFinderImpl();
		long stockId = extComp1.findStockIdByStockName(stockName);
		//extComp2
		IBSEStockValueFinder extComp2 = new BSEStockValueFinderImpl();
		StockDetailsDTO dto = extComp2.findStockDetailsById(stockId);
		//extComp3
		IBSEStockFutureValueFinder extComp3 = new BSEStockFutureValueFinderImpl();
		StockFutureDetailsDTO futureDTO = extComp3.findStockFutureDetailsByStockName(dto);
		
		//Prepare StockAllDetailsDTO class object
		StockAllDetailsDTO allDetailsDTO = new StockAllDetailsDTO();
		allDetailsDTO.setStockId(dto.getStockId());
		allDetailsDTO.setStockName(dto.getStockName());
		allDetailsDTO.setStockType(dto.getStockType());
		allDetailsDTO.setStockValue(dto.getStockValue());
		allDetailsDTO.setCompany(dto.getCompany());
		allDetailsDTO.setListedOn(dto.getListedOn());
		allDetailsDTO.setNextOneYearStockValue(futureDTO.getNextOneYearStockValue());
		allDetailsDTO.setNextTwoYearStockValue(futureDTO.getNextTwoYearStockValue());
		allDetailsDTO.setNextThreeYearStockValue(futureDTO.getNextThreeYearStockValue());
		allDetailsDTO.setChangePercentage(futureDTO.getChangePercentage());
		allDetailsDTO.setVerifiedOn(LocalDate.now());
		return allDetailsDTO;
	}

}
