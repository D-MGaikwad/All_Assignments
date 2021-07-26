package com.spring.que10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


public class AppContextAware implements ApplicationContextAware  {
	ApplicationContext context;
	public ApplicationContext getContext() {
		return context;
	}
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context=context;
	}

}
