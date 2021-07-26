package com.spring;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerContact;
	private Address customerAddress;
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	public Address getAddress() {
		return customerAddress;
	}

	public void setAddress(Address Address) {
		this.customerAddress = Address;
	}

	@Override
	public String toString() {
		return "Customer [CustomerId= " + customerId + ", Customer_Name= " + customerName + ", Customer_Contact= "
				+ customerContact + ", Customer_Address= " + customerAddress + "]";
	}

}
