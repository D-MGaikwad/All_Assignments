package company;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Fruit_Q1toQ3 {

	public static void main(String[] args) {

		  Set<Fruit> fruitSet = new HashSet<Fruit>();
		  
		  Fruit fruit1 = new Fruit("Apple", 52, 100, "Red");
		  Fruit fruit2 = new Fruit("Banana",111, 50, "Yellow");
		  Fruit fruit3 = new Fruit("Grapes", 104, 90, "Green");
		  Fruit fruit4 = new Fruit("Strawberry", 33, 250, "Red");
		  Fruit fruit5 = new Fruit("Mango", 202, 500, "Yellow");
		  Fruit fruit6 = new Fruit("Orange", 62, 150, "Orange");
		  
		  fruitSet.add(fruit1);
		  fruitSet.add(fruit2);
		  fruitSet.add(fruit3);
		  fruitSet.add(fruit4);
		  fruitSet.add(fruit5);
		  fruitSet.add(fruit6);
		  
		fruitSet.forEach(System.out::println);

		System.out.println(" ");
		System.out.println("1. Fruits with low calories: ");
		fruitSet.stream().filter(c ->c.calories< 100).forEach(System.out::println);
		
		System.out.println(" ");
		
	
		List<Fruit> f = fruitSet.stream().sorted(Comparator.comparing(Fruit::getColor)).collect(Collectors.toList());  
		
		System.out.println("2. Color wise fruit names: ");
		f.forEach(fruit -> System.out.println(fruit));
		
	    List<Fruit> f1 = fruitSet.stream().filter(col ->col.getColor().contains("Red")).sorted(Comparator.comparingInt(Fruit::getPrice)).collect(Collectors.toList());  
        System.out.println(" ");
		System.out.println("3. Price of Red color fruits: ");
		f1.forEach(fruit -> System.out.println(fruit));
		
      
	}

}
