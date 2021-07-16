package company;

import java.util.ArrayList;
import java.util.function.Predicate;

public class A4_Que_4 {

	public static void main(String[] args) {
		
		ArrayList<String> word = new ArrayList<>();
		
		    word.add("Sky");
		    word.add("Public");
		    word.add("Boat");
		    word.add("Vehicle");
		    word.add("Java");
		    word.add("Water");
		
			Predicate<String> predicate = p -> ((p.length()) % 2 != 0);
			word.removeIf(predicate);
			word.forEach(System.out::println);
		   
	}
	 
	      

}
