package company;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Transactions_Q8toQ15 {

	public static void main(String[] args) {

		Trader Mark = new Trader("Mark ", "Mumbai");
		Trader Raman  = new Trader("Raman ","Pune");
		Trader Daisy = new Trader("Daisy ","Delhi");
		Trader James = new Trader("James ","Bangalore");
		Trader Varun = new Trader("Varun ","Pune");
		Trader Lily = new Trader("Lily ","Indore");


		List<Transaction> transactions = Arrays.asList(
		    new Transaction(Mark, 2005, 5500),
		    new Transaction(Raman, 2011, 12000),
		    new Transaction(James, 2010, 8500),
		    new Transaction(Daisy, 2011, 34500),
		    new Transaction(Varun, 2009, 52000),
		    new Transaction(Lily, 2010, 6550)
		);
		 
		System.out.println("8. Transaction in the year 2011: ");
        List<Transaction> t = transactions.stream().filter(y ->y.year==2011)
        		            .sorted(Comparator.comparingInt(Transaction::getYear)).collect(Collectors.toList());  
	    t.forEach(System.out::println);
	    
	    System.out.println(" ");
	    System.out.println("9.Cities: ");
	    transactions.stream().map(transaction -> {System.out.println(transaction.getTrader().getCity());
			                         return transaction.getValue();}).distinct().collect(toList());
	    
		
	    System.out.println(" ");
	    System.out.println("10.Traders from Pune: ");
	    List<Trader> traders =
			    transactions.stream().map(Transaction::getTrader).filter(trader -> trader.getCity().equals("Pune"))	
			                .distinct().sorted(comparing(Trader::getName)).collect(toList());
	    traders.forEach(System.out::println);
		
		System.out.println(" ");
		System.out.println("11. ");
		String traderStr =
			    transactions.stream().map(transaction -> transaction.getTrader().getName())	
			                .distinct().sorted().reduce("Names: ", (n1, n2) -> n1 + n2);	
		System.out.println(traderStr);
		
		System.out.println(" ");
		System.out.println("12. Are any traders based in Indore? ");
		boolean indoreBased =
			    transactions.stream().anyMatch(transaction -> transaction.getTrader()
			                                                    .getCity().equals("Indore"));	
		System.out.println(indoreBased);
		
		System.out.println(" ");
		System.out.println("13. All Transactions in Delhi: ");
     	transactions.stream().filter(t1 -> "Delhi".equals(t1.getTrader().getCity()))	
                             .map(Transaction::getValue).forEach(System.out::println);	
		
		System.out.println(" ");
		System.out.println("14. Highest value of all transactions: ");
		Optional<Integer> highestvalue =transactions.stream().map(Transaction::getValue)	
			                                                  .reduce(Integer::max);
		System.out.println(highestvalue);
		
		System.out.println(" ");
		System.out.println("15. Smallest value of all transactions: ");
        Optional<Transaction> smallestTransaction =transactions.stream()
				                  .reduce((t1, t2) ->t1.getValue() < t2.getValue() ? t1 : t2);	
		System.out.println(smallestTransaction);
 
	}

}

