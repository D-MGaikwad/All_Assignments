package com.spring.que9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {

	public static void main(String[] args) {
		
   AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/spring/que9/Newconfigfile.xml");
           
		   //registering shutdown hook
           context.registerShutdownHook();
	       
           System.out.println(" ");
           Account acc =(Account) context.getBean("acc");
           System.out.println(acc);
           System.out.println(" ");
           
	}
}
