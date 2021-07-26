package com.spring.que8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Account implements InitializingBean, DisposableBean  {
  
	private String loginId;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Account [LoginId=" + loginId + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Logged-in: InitializingBean");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Logged-out : DisposableBean");
		
	}
	
	
}
