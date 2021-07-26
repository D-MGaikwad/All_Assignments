package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class javaConfig {
	
	@Bean
	public FilingData getFilingData() {
		return new FilingData();
	} 

	@Bean(name= {"EmpInfo","Information","Employee"})
	public Employee getEmployee() {
		
		//creating new Employee object
		Employee employee = new Employee(getFilingData());
		return  employee;
	}
}
