package com.spring.que7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sum {
	
    @Value("#{ 22+11 }")
	private int a;
    
    @Value("#{ 12+4+60 }")
	private int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "Values [a=" + a + ", b=" + b + "]";
	}

}
