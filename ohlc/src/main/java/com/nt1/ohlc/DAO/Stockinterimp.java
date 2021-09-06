package com.nt1.ohlc.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt1.ohlc.classes.Stock;



@Repository
public class Stockinterimp implements StockInterface {
	
	
	@Autowired
	private List<Stock> stocks;
	
	
	@Override
	public List<Stock> getall() {
		/*TreeSet<String> temp=new TreeSet<String>();
		for(int i=0;i<stocks.size();i++)
		{
			temp.add(stocks.get(i).getSymbol());
		}
		System.out.println(temp);*/
		return stocks;
	}


	@Override
	public List<Stock> getbycompany(String companyName) {
		
		List<Stock> ans=new ArrayList<Stock>(15);
		
		for(int i=0;i<stocks.size();i++)
		{
			Stock temp=stocks.get(i);
			
			String temper=temp.getSymbol();
			if(temper.equals(companyName))
			{
				ans.add(temp);
			}
			
		}
		
		return ans;
	}


	@Override
	public Stock getbyCompanyandDate(String comname, String date) {
		
		Stock ans=null;
		
		for(int i=0;i<stocks.size();i++)
		{
			Stock temp=stocks.get(i);
			
			String temp_sym=temp.getSymbol();
			String temp_date=temp.getDate();
			if(temp_sym.equals(comname) && temp_date.equals(date))
			{
				ans=temp;
				
			}
			
		}
		
		
		return ans;
		
		
	}


	@Override
	public List<Stock> getbyCompanyandTwoDates(String comname, String date_start, String date_end) {
		
		
		
		List<Stock> temp=getbycompany(comname);
		
		List<Stock> ans=new ArrayList<Stock>();
		
		String [] low_date=date_start.split("-");
		String[] high_date=date_end.split("-");
		
		List<Integer> start_date=new ArrayList<Integer>();
		List<Integer> end_date=new ArrayList<Integer>();
		for(int i=0;i<3;i++)
		{
			start_date.add(Integer.parseInt(low_date[i]));
			end_date.add(Integer.parseInt(high_date[i]));
		}
		
		for(int i=0;i<temp.size();i++)
		{
			Stock temper_var=temp.get(i);
			String [] curr_date_str=temper_var.getDate().split("-");
			
			List<Integer> curr_date=new ArrayList<Integer>();
			
			for(int j=0;j<3;j++)
			{
				curr_date.add(Integer.parseInt(curr_date_str[j]));
			}
			
			
			if(curr_date.get(0) >=start_date.get(0) && curr_date.get(0) <= end_date.get(0))
			{

				if(curr_date.get(1) >=start_date.get(1) && curr_date.get(1) <= end_date.get(1))
				{

					if(curr_date.get(2) >=start_date.get(2) && curr_date.get(2) <= end_date.get(2))
					{
						ans.add(temper_var);
					}
				}
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		return ans;
	}


}
