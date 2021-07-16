package company;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class A4_Que_3 {

	public static void main(String[] args) {
		
		
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random value: ");
        System.out.println(randomValue.get());
        

        System.out.println(" "); 
        Consumer<String> printTwice = value -> {
            System.out.println(value);
            System.out.println(value);
        };
        printTwice.accept("Lamda Expression");
        printTwice.accept("Functional Interface");
        
 
		System.out.println(" "); 
        Predicate<Integer> lesserthan = i -> (i < 45); 
        System.out.println(lesserthan.test(32)); 
      

		System.out.println(" "); 
        Function<String,String> upperCase = (string) -> string.toUpperCase();
        System.out.println("Java " +upperCase.apply("Lamda Expression"));
	}

}
