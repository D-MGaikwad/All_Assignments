package com.spring.service;

public interface BankAccountService {

	public double withdraw(long accountId, double amount);
	public double deposit(long accountId, double newBalance);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount, long toAccount, double amount);
	
}
