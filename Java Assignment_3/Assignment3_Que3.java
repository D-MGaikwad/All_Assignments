package company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.*;
public class Assignment3_Que3 {

	public static void main(String[] args) {
		
	   List<Integer> number_list = new ArrayList<>();
		
	   number_list.add(23);
 	   number_list.add(6);
 	   number_list.add(42);
 	   number_list.add(3);
	   number_list.add(16);
	   number_list.add(24);
	   
	   Collections.sort(number_list);
	   System.out.println(number_list);
	  
	   Collections.sort(number_list, Comparator.reverseOrder());
	   
       System.out.println("Sorted ArrayList in reverse order is: ");

       ListIterator<Integer> numIterator= number_list.listIterator();
	   
	   while (numIterator.hasNext()) {
		   
           System.out.println(numIterator.next());
       }
       
	}
}
 	   
		
	


