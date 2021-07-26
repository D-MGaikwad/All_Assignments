package com.spring.que10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("com/spring/que10/appcontextconfig.xml");
		AppContextAware appcontext= (AppContextAware)context.getBean("appcontext");
		ApplicationContext appCon =appcontext.getContext();
		App a= (App)appCon.getBean("testA");
		a.doSum();
		context.registerShutdownHook();
	}
} 

