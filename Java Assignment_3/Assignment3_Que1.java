package company;
import java.util.Comparator;
import java.util.TreeSet;

public class Assignment3_Que1 {

	public static void main(String a[]) {
    	
		TreeSet<Person> wComp = new TreeSet<Person>(new CompPerson());
		     wComp.add(new Person(60, 6, "Tom"));
                     wComp.add(new Person(65, 5 ,"John"));
                     wComp.add(new Person(58, 6, "Varun"));
                     wComp.add(new Person(65, 6 ,"John"));
                     wComp.add(new Person(57, 4, "Lily"));
                     wComp.add(new Person(62, 5, "Ram"));
        
        for(Person e:wComp){
            System.out.println(e);
        }
	}
	
}
         class CompPerson implements Comparator<Person>{
        	 
            @Override
            public int compare(Person e1, Person e2) {
                if(e1.getWeight() > e2.getWeight()){
                    return 1;
                } else {
                    return -1;
                }
            }
        }
        
       