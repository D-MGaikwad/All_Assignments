package com.spring2;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerContact;
	private Address customerAddress;

	public Customer(int customerId, String customerName, String customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [CustomerId= " + customerId + ", Customer_Name= " + customerName + ", Customer_Contact= "
				+ customerContact + ", Customer_Address= " + customerAddress + "]";
	}

}
