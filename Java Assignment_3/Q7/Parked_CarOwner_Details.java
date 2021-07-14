package company;

import java.util.Scanner;

public class Parked_CarOwner_Details {
	int token;
	String ownerName;
	String ownerAddress;
	String carModel;
	double ownerMobileNo;
	
	static int i=1;
	
	Scanner ip = new Scanner(System.in);
	  public Parked_CarOwner_Details() {
		  
		  System.out.println("Please enter your name:");
		  ownerName = ip.nextLine();
		  
		  System.out.println("Please enter your address:");
		  ownerAddress = ip.nextLine();
		  
		  System.out.println("Please enter your car model:");
		  carModel = ip.nextLine();
		  
		  System.out.println("Please enter your Mobile Number:");
		  ownerMobileNo = ip.nextInt();
		  
		  
		  
		  token = i;
		  i++;
		  
	  }
	public int getToken() {
		return token;
	}
	public void setToken(int token) {
		this.token = token;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public double getOwnerMobileNo() {
		return ownerMobileNo;
	}
	public void setOwnerMobileNo(double ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	
	
	@Override
	public String toString() {
		return "Parked_CarOwner_Details [token id=" + token + ", Name of car owner=" + ownerName + ", Car-model=" + carModel
				+ ", Mobile No of owner=" + ownerMobileNo + ", Address of owner=" + ownerAddress + "]";
	}
	
}
