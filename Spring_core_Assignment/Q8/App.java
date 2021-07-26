package com.spring.que8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
   AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/spring/que8/configfile.xml");
           
		   //registering shutdown hook
           context.registerShutdownHook();
		   
           System.out.println("-----:init methods");

           System.out.println(" ");
		   Employee emp1 =(Employee) context.getBean("emp1");
           System.out.println(emp1);        
           
           System.out.println("----------------------------");
           
           Account acc=(Account) context.getBean("acc");
           System.out.println(acc);
           
           System.out.println("----------------------------");
  
           Example exmp=(Example) context.getBean("exmp");
           System.out.println(exmp);
           
           System.out.println(" ");
           System.out.println("destroy methods:----");
          
           
 	}

}
