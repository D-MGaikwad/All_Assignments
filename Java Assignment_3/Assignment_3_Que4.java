package company;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment_3_Que4 {

	      public static void main(String[] args){
		
           Date dobEmp1 = new Date(15,8,1990);
           Date dobEmp2 = new Date(24,2,1987);
           Date dobEmp3 = new Date(18,11,1990);
           Date dobEmp4 = new Date(30,4,1986);
           Date dobEmp5 = new Date(24,2,1992);
       
         Map<Date,String> CompDobEmp = new HashMap<>();
       
           CompDobEmp.putIfAbsent(dobEmp1, "Varun");
           CompDobEmp.putIfAbsent(dobEmp2, "Lily");
           CompDobEmp.putIfAbsent(dobEmp3, "Steve");
           CompDobEmp.putIfAbsent(dobEmp4, "Jack");
           CompDobEmp.putIfAbsent(dobEmp5, "Mark");
       
           for (Entry<Date,String> entry :CompDobEmp.entrySet()) {	 
	    
           System.out.println(entry.getKey()+" "+ entry.getValue() );                  

           }
           
	      }

	}
	
	
