package com.springcore.javaconfig;

public class Employee {

	private FilingData filingData;
	
	public Employee(FilingData filingData) {
		super();
		this.filingData = filingData;
	}

	public FilingData getFilingData() {
		return filingData;
	}

	public void setFilingData(FilingData filingData) {
		this.filingData = filingData;
	}

	public void work() {
		this.filingData.entry();
		System.out.println("Employee is working");
	}
}
