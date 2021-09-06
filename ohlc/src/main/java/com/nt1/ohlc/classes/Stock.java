package com.nt1.ohlc.classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = {"volume","id","key","subkey","updated","changeOverTime","marketChangeOverTime","uOpen",
		"uClose","uHigh","uLow","uVolume","fOpen","fClose","fHigh","fLow","fVolume","label","change","changePercent"})
public class Stock {
	
	private String symbol;
	
	
	
	private int open;
	
	private int high;
	
	private int low;
	
	private int close;
	
	private String date;
	
	public Stock()
	{
		
	}


	public Stock(String symbol, int open, int high, int low, int close, String date) {
		
		this.symbol = symbol;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.date = date;
	}


	public String getSymbol() {
		return symbol;
	}


	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


	public int getOpen() {
		return open;
	}


	public void setOpen(int open) {
		this.open = open;
	}


	public int getHigh() {
		return high;
	}


	public void setHigh(int high) {
		this.high = high;
	}


	public int getLow() {
		return low;
	}


	public void setLow(int low) {
		this.low = low;
	}


	public int getClose() {
		return close;
	}


	public void setClose(int close) {
		this.close = close;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Stock [symbol=" + symbol + ", open=" + open + ", high=" + high + ", low=" + low + ", close=" + close
				+ ", date=" + date + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
