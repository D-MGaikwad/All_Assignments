package company;

import java.util.TreeSet;

public class BankAccountList {

	public static void main(String[] args) {
		
		TreeSet<SavingAccount> list = new TreeSet<SavingAccount>(new SavingAccount());

	
		list.add(new SavingAccount(250190, 12098, "Rama", true));
		list.add(new SavingAccount(826100, 22287, "Steve", true));
		list.add(new SavingAccount(621800, 65378, "Varun", false));
		list.add(new SavingAccount(256000, 34465, "Lily", true));
		list.add(new SavingAccount(123100, 47545, "Stacy", false));
		list.add(new SavingAccount(860500, 10623, "Jack", true));
		
		
		for(SavingAccount e:list){
			   System.out.println(e); 
			   }
	}

}
