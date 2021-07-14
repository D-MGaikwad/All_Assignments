package company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFast {

	public static void main(String[] args) {
		
		 Map<String,String> Student = new HashMap<String,String>();
		 
		  Student.put("John", "Watson");
		  Student.put("Steve", "Cullen");
		  Student.put("Mark","Smith");
		  Student.put("Raman", "Singh");
		  Student.put("Jack","Smith");

		  System.out.println(Student);

	        
	        Iterator<String> iterator = Student.keySet().iterator();
	        
	        while (iterator.hasNext())
	        {
	            System.out.println(Student.get(iterator.next()));
	            Student.put("Sarah", "Williams");
	        }

	}
}
