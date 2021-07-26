package com.spring.repository;

import com.spring.BankAccount;
import com.spring.BankAccountList;

public class BankAccountRepositoryImpl implements BankAccountRepository {

	BankAccountList bankAccountList;
	
	@Override
	public double getBalance(long accountId){
		
		BankAccount account = bankAccountList.getAccountList().stream().filter(x ->x.getAccountId()==accountId).findFirst().get();
		
		if(account != null)
		  return account.getAccountBalance();	
		
		return 0;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		
		BankAccount account = bankAccountList.getAccountList().stream().filter(x ->x.getAccountId()==accountId).findFirst().get();
		
		if (account != null) {
			account.setAccountBalance(newBalance);
		}
		return 0;
	}
	
	public void setBankAccounts(BankAccountList bankAccounts) {
		this.bankAccountList = bankAccounts;
	}

}
