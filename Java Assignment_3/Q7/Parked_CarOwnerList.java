package company;

import java.util.ArrayList;
import java.util.List;

public class Parked_CarOwnerList {
	
static List<Parked_CarOwner_Details> p1= new ArrayList<>();
	
	public void add_new_car(List<Parked_CarOwner_Details> own_details)
	{
		if (own_details.isEmpty()) {
			
			own_details.add(new Parked_CarOwner_Details());
		}
		else {
			own_details.add(new Parked_CarOwner_Details());
		}
		}
	
	
	public void remove_car(List<Parked_CarOwner_Details> p1, int a)
	{
		p1.remove(a-1);
	}
	
	
	public void getParkedCarLocation(int a) {
		
		if(a<=80) {
		System.out.println("Car is parked on the first floor");
	} else if(a>80 && a <= 160) {
	    System.out.println("Car is parked on the second floor");
	} else if(a>160 && a <= 240) {
	    System.out.println("Car is parked on the third floor");
	} else if(a>240 && a <= 320) {
	    System.out.println("Please enter a valid token id!");
	}
	    }
	
	  
             
}

