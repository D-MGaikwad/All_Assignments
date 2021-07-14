package company;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe {
	public static void main(String[] args) {
		
		   ConcurrentHashMap<String,String> Student = new ConcurrentHashMap<String,String>();
                 
		   Student.put("John", "Watson");
		   Student.put("Steve", "Cullen");
		   Student.put("Mark","Smith");
		   Student.put("Raman", "Singh");
		   Student.put("Jack","Smith");

		   System.out.println(Student);
		   
           Iterator<String> iterator = Student.keySet().iterator();

              while (iterator.hasNext()) {
                    System.out.println(Student.get(iterator.next()));
                    Student.put("Sarah", "Williams");
                    }

	}
}
