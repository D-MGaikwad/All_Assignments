package com.spring.service;

import com.spring.repository.BankAccountRepositoryImpl;

public class BankAccountServiceImpl implements BankAccountService {

	BankAccountRepositoryImpl bankAccountRepository;
	
	@Override
	public double withdraw(long accountId, double amount) {
		double balance = bankAccountRepository.getBalance(accountId);	
		
		if(balance > amount) {
			balance -= amount;
			bankAccountRepository.updateBalance(accountId, balance);
			return balance;
		}		
		return 0;
	}

	@Override
	public double deposit(long accountId, double amount) {		
        double balance = bankAccountRepository.getBalance(accountId);		
		
        if(balance > 0) {
			balance += amount;
			bankAccountRepository.updateBalance(accountId, balance);
			return balance;
		}		
		return 0;
		
	}

	@Override
	public double getBalance(long aacountId) {
		
		return bankAccountRepository.getBalance(aacountId);
	}
	
	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		
		double fromAccountNewBalance = bankAccountRepository.getBalance(fromAccount) - amount;
		double toAccountNewBalance = bankAccountRepository.getBalance(fromAccount) + amount;
		
		if(fromAccountNewBalance > 0 && toAccountNewBalance > 0) {
			bankAccountRepository.updateBalance(fromAccount, fromAccountNewBalance);
			bankAccountRepository.updateBalance(toAccount, toAccountNewBalance);
            return true;
		}
		return false;
	}
	
    public void setBankAccountRepository(BankAccountRepositoryImpl bankAccountRepository) {
	 
    	this.bankAccountRepository = bankAccountRepository;
 }
	
}
