package com.spring.que8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
 
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [Subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting method ( @PostConstruct )");
	}
	
     @PreDestroy
	public void end() {
		System.out.println("Ending method ( @PreDestroy )");
	}
	
}
