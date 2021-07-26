package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/collconfig.xml");
    	
    	Question Que=(Question) context.getBean("queId");
    	 System.out.println(Que);
    	 
    	 Question1 Que1=(Question1) context.getBean("queId1");
    	 System.out.println(Que1);
    	 
    	 Question2 Que2=(Question2) context.getBean("queId2");
    	 System.out.println(Que2);
    	 
    }
}
