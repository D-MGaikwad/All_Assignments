package com.spring.question6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	  AbstractApplicationContext con= new ClassPathXmlApplicationContext("com/spring/question6/stereoconfig.xml");
      
	  Student obj= con.getBean("obj",Student.class);
      System.out.println(obj);
	}

}
