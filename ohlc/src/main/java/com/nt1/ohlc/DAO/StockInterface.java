package com.nt1.ohlc.DAO;

import java.util.List;

import com.nt1.ohlc.classes.Stock;

public interface StockInterface {

	public List<Stock> getall();
	
	public List<Stock> getbycompany(String companyName);
	
	public	Stock getbyCompanyandDate(String comname,String date);
	
	public List<Stock> getbyCompanyandTwoDates(String comname,String date_start,String date_end);
	
}
