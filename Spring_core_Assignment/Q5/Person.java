package com.spring.ResAnno2;

import org.springframework.beans.factory.annotation.Required;

public class Person {

	private Integer age;
	   private String name;

	   @Required
	   public void setAge(Integer age) {
	      this.age = age;
	   }
	   public Integer getAge() {
	      return age;
	   }
	   
	   @Required
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getName() {
	      return name;
	   }
}
