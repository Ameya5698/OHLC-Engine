package com.nt1.ohlc.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nt1.ohlc.DAO.StockInterface;
import com.nt1.ohlc.classes.Stock;

@RestController
@CrossOrigin()
public class RestStock {
	
	@Autowired
	private StockInterface dao;
	
	
	@GetMapping("/stocks")
	
	public List<Stock> getall()
	{
		return dao.getall();
	}
	
	
	@GetMapping("/stocks/{symbol}")

	public List<Stock> getbysym(@PathVariable("symbol") String sym)
	{	
		
		/*System.out.println(sym);*/
		
		return dao.getbycompany(sym);
		
		
	}
	
	
	@GetMapping("/stocks/{symbol}/{date}")

	public Stock getbySymAndDate(@PathVariable("symbol") String sym,@PathVariable("date") String date)
	{
		return dao.getbyCompanyandDate(sym, date);
	}
	

	@GetMapping("/stocks/{symbol}/{sdate}/{edate}")

	public List<Stock> getbySymAndDate(@PathVariable("symbol") String sym,@PathVariable("sdate") String sdate,@PathVariable("edate") String edate)
	{
		return dao.getbyCompanyandTwoDates(sym, sdate, edate);
	}
	
	
	
}
