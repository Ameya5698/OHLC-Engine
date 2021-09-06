package com.nt1.ohlc.classes;

public class HttpReq {

	private String companyName;
	private String startDate;
	private String endDate;
	
	public HttpReq()
	{
		
	}
	
	public HttpReq(String companyName, String startDate, String endDate) {
		
		this.companyName = companyName;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "HttpReq [companyName=" + companyName + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	
	
	
	
	
}
