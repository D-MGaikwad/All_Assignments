package com.spring.que9;

public class Account {

	private String LoginId;

	public String getLoginId() {
		return LoginId;
	}

	public void setLoginId(String LoginId) {
		this.LoginId = LoginId;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Account [LoginId = " + LoginId + "]";
	}
	
	public void init() {
		System.out.println("Logged-in");
		System.out.println("---Inside init method---");
	}
	
	public void destroy() {
		System.out.println("Logged-out");
		System.out.println("---Inside destroy method---");
	}
	
}
