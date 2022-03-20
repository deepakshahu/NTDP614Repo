package com.nit.ext3;

import com.nit.dto.StockDetailsDTO;
import com.nit.dto.StockFutureDetailsDTO;

public class BSEStockFutureValueFinderImpl implements IBSEStockFutureValueFinder {

	@Override
	public StockFutureDetailsDTO findStockFutureDetailsByStockName(StockDetailsDTO detailsDTO) {
		System.out.println("BSEStockFutureValueFinderImpl.findStockFutureDetailsByStockName()");
		StockFutureDetailsDTO futureDTO = new StockFutureDetailsDTO();
		if(detailsDTO.getStockId()==1122) {
			futureDTO.setNextOneYearStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.10f);
			futureDTO.setNextTwoYearStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.20f);
			futureDTO.setNextThreeYearStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.30f);
			futureDTO.setChangePercentage(10.0);
		}
		else if(detailsDTO.getStockId()==2233) {
			futureDTO.setNextOneYearStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.11f);
			futureDTO.setNextTwoYearStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.22f);
			futureDTO.setNextThreeYearStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.33f);
			futureDTO.setChangePercentage(11.0);
		}
		else if(detailsDTO.getStockId()==3344) {
			futureDTO.setNextOneYearStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.12f);
			futureDTO.setNextTwoYearStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.24f);
			futureDTO.setNextThreeYearStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.36f);
			futureDTO.setChangePercentage(12.0);
		}
		else if(detailsDTO.getStockId()==4455) {
			futureDTO.setNextOneYearStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.13f);
			futureDTO.setNextTwoYearStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.26f);
			futureDTO.setNextThreeYearStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.38f);
			futureDTO.setChangePercentage(13.0);
		}
		else
			throw new IllegalArgumentException("Invalid Stock Details");
		return futureDTO;
	}

}
