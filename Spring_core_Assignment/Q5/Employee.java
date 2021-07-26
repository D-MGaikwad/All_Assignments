package com.spring.ResAnno2;

import javax.annotation.Resource;

public class Employee {

	private int employeeId;
	private String employeeName;
	
	@Resource(name="account1")
	private Account account;

	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}
