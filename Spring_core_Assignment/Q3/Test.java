package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.controller.BankAccountController;

public class Test {
		
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BankAccountController.class);
		BankAccountController acc = context.getBean(BankAccountController.class);
		BankAccountList accList = context.getBean(BankAccountList.class);
		
        System.out.println(accList.getAccountList());
        System.out.println(acc.getBalance(1462));
        System.out.println(acc.withdraw(1254, 5000));
        System.out.println(acc.deposit(1456,1500));
        System.out.println(acc.fundTransfer(1422, 1456, 10000));


		
	}
	

	
	
}
