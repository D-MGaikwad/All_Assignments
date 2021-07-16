package company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class A4_Que_8 {

	public static void main(String[] args) {

			    List<Integer> list = new ArrayList<>();
			
		        list.add(44235);
		        list.add(65217);
		        list.add(88723);
		        list.add(24564);
		        list.add(14436);
		        list.add(45267);

		        System.out.println("The list of numbers: ");
		        Consumer<List<Integer>> iterate = i-> {i.forEach(System.out::println);};
		        Thread t = new Thread(()-> iterate.accept(list));
		        t.start();
	}

}
