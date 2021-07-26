package com.question4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.question4");
		context.refresh();

		//MathService ms = context.getBean(MathService.class);
		MathService ms = (MathService) context.getBean("ms");

		int add = ms.add(1, 2);
		System.out.println("Addition of 10 and 12 = " + add);

		int subtract = ms.subtract(2, 1);
		System.out.println("Subtraction of 25 and 15 = " + subtract);
		
		//close the spring context
		context.close();
    }
}
