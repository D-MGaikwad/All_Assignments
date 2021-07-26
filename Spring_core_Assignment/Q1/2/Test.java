package com.spring2;

import org.springframework.context.ApplicationContext;
  
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class Test 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring2/NewFile2.xml");

    	Customer customer =(Customer) context.getBean("customer1");  
        System.out.println(customer);
        
    }
}
