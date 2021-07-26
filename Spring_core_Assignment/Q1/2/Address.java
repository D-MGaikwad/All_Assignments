package com.spring2;


public class Address {
	
	private String street;
	private String city;
	private String state;
	private int zip;
	private String country;
	
	public Address(String street, String city, String state, int zip, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [Street=" + street + ", City=" + city + ", State=" + state + ", Zip=" + zip + ", Country="
				+ country + "]";
	}
	
	
	
}
