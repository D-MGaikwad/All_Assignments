package company;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment_3_Que5 {

	public static void main(String[] args) {
		
        Hashtable<Employee, Integer> list = new Hashtable<Employee, Integer>();
		
		list.put(new Employee("Navin", 44321),101);
		list.put(new Employee("James", 43241),102);
		list.put(new Employee("Mark", 44326),103);
		list.put(new Employee("Priti", 45012),104);
		list.put(new Employee("John", 44310),105);
		
		Set<Entry<Employee, Integer>> entrySet = list.entrySet();
		
		for (Entry<Employee, Integer> entry : entrySet) {	 
            
        System.out.println(entry.getKey()+ " Sr.No:"+ entry.getValue());
		
        }
		
	}
}


