package company;

import java.util.HashMap;

public class A4_Que_7 {

	public static void main(String[] args) {

		    HashMap<String,String> map = new HashMap<>();
		    
	        StringBuilder str = new StringBuilder();
	        
	        map.put("Steve_","Williams_");
	        map.put("Tom_","Parker_");
	        map.put("James_","Smith_");
	        map.put("Daisy_","Johnson");

	        for(HashMap.Entry<String,String> name : map.entrySet())
	        {
	            String s1 = name.getKey();
	            String s2 = name.getValue();
	            str.append(s1).append(s2);
	        }
	        
	        System.out.println("String is: " +str);

	}

}
