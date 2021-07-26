package com.spring.controller;

import com.spring.service.BankAccountServiceImpl;

public class BankAccountController {
	
	BankAccountServiceImpl bankAccountService;

	public double withdraw(long accountId, double amount) {	
		return bankAccountService.withdraw(accountId,amount);
	}

	public double deposit(long accountId, double amount) {	
		return bankAccountService.deposit(accountId,amount);
	}

	public double getBalance(long accountId) {	
		return bankAccountService.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {		
		return bankAccountService.fundTransfer(fromAccount,toAccount,toAccount);
	}

   public void setBankAccountService(BankAccountServiceImpl bankAccountService) {
	   this.bankAccountService = bankAccountService;
   }
   
   public BankAccountController(BankAccountServiceImpl bankAccountService) {
	   super();
	   this.bankAccountService = bankAccountService;
   }
	
	
}
