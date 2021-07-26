package com.spring.que8;

public class Employee {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [Name=" + name + "]";
	}
	
	public void init() {
		System.out.println("---Inside init method---");
	}
	
	public void destroy() {
		System.out.println("---Inside destroy method---");
	}
	
}
