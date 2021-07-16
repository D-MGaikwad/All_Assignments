package company;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

class Op implements UnaryOperator<String> { 
	                public String apply(String str) { return str.toUpperCase();
	              }
	}

public class A4_Que_6 {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<>();
		
		name.add("Mark");
		name.add("Jason");
		name.add("Priya");
		name.add("John");
		name.add("Varun");
		name.add("Daisy");
		
		System.out.println("Names: " +name);
		
		name.replaceAll(new Op());
		System.out.println("Names after replace method: " +name);
		

	}

}
