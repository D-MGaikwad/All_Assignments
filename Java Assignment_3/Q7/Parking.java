package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		int tkn;
		
		List<Parked_CarOwner_Details> own_details =new ArrayList<Parked_CarOwner_Details>();
		
		Parked_CarOwnerList od1 = new Parked_CarOwnerList();
		Parked_CarOwnerList od2 = new Parked_CarOwnerList();
		Parked_CarOwnerList od3 = new Parked_CarOwnerList();
		Parked_CarOwnerList od4 = new Parked_CarOwnerList();
		
		od1.add_new_car(own_details);
		od2.add_new_car(own_details);
		od3.add_new_car(own_details);
		od4.add_new_car(own_details);
		
		printAll(own_details);
		
		System.out.println("Enter your token id:");
		tkn = t.nextInt();
		
		od2.getParkedCarLocation(tkn);
		System.out.println("Before Deletion");
		printAll(own_details);

		od2.remove_car(own_details, tkn);
		System.out.println("After Deletion");
		printAll(own_details);

	}

	private static void printAll(List<Parked_CarOwner_Details> own_details) {

		for(Parked_CarOwner_Details pc :own_details) {
			System.out.println(pc);
		}
	}


	}


