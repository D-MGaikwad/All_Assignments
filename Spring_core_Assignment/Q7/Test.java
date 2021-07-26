package com.spring.que7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

	 ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/que7/spelconfig.xml");
	 Sum s1= context.getBean("sum", Sum.class);
	
	 System.out.println("The values of a and b are:");
	 System.out.println(s1);
	 
	}

}
