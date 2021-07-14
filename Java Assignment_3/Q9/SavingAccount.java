package company;

import java.util.Comparator;
import java.util.Objects;

public class SavingAccount implements Comparator<SavingAccount> {
	
	private double acc_balance;
	private int acc_ID;
	private String accountHoldername;
	private Boolean isSalaryAccount;
	private double withdraw;
	private double deposit;
	 
	public SavingAccount(double acc_balance,int acc_ID,String accountHoldername,Boolean isSalaryAccount) {
		
	    this.acc_balance =acc_balance;
	    this.acc_ID= acc_ID;
	    this.accountHoldername =accountHoldername;
	    this.isSalaryAccount= isSalaryAccount;	
	}
	
	SavingAccount(){
		acc_balance=0;
		acc_ID=0;
		withdraw=0;
		deposit=0;	
	}
	

	public int getAcc_ID() {
		return acc_ID;
	}

	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(acc_ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		return acc_ID == other.acc_ID;
	}

	@Override
	public int compare(SavingAccount o1, SavingAccount o2) {
		 if(o1.getAcc_ID() > o2.getAcc_ID()){
             return 1;
         } else {
             return -1;
         }
	}
	

	@Override
	public String toString() {
		return "SavingAccount [Account_balance= " + acc_balance + ", Account_ID= " + acc_ID + ", Account_Holder_name="
				+ accountHoldername + ", isSalaryAccount= " + isSalaryAccount + "]";
	}
	
	
}

