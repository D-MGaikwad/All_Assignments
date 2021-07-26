package com.spring;

import java.util.HashSet;
import java.util.Set;

public class BankAccountList {

	private Set<BankAccount> accountList = new HashSet<>();
	
	private BankAccountList() {
		
		this.accountList.add(new BankAccount(1231, "Daisy", "Savings", 500000));
		this.accountList.add(new BankAccount(1456, "Jason", "Salary", 100500));
		this.accountList.add(new BankAccount(1234, "Lily", "Savings", 500100));
		this.accountList.add(new BankAccount(1254, "Raman", "Savings", 245000));
		this.accountList.add(new BankAccount(1462, "Mark", "Salary", 250000));
		this.accountList.add(new BankAccount(1422, "Steve", "Salary", 850000));
	
	}
	
	public Set<BankAccount> getAccountList(){
		return accountList;
	}
	
	public void setAccountList(Set<BankAccount> accountList){
		this.accountList =accountList;
	}
}
