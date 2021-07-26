package com.spring;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class Test 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/NewFile.xml");

    	Customer customer = (Customer) context.getBean("customer1");
        System.out.println(customer.getAddress());
        System.out.println(customer);
        
    }
}
