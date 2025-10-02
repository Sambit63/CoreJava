package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class ConsumerInterfaces {
	public static void main(String[] args) {
//		EX-1
		Consumer<Integer> consume=x->System.out.println(x);
		consume.accept(45);//45
		
//	Ex-2
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		Consumer<List<Integer>> printList=x->{
			for(int i:x)System.out.print(i+" ");
		};
		printList.accept(list);//1 2 3 4 5 6
		
//	Ex-3
		Consumer<Integer> c1 = x -> System.out.print(x + " ");
		Consumer<Integer> c2 = x -> System.out.println("Square: " + x * x);

		c1.andThen(c2).accept(5);// Output: 5 Square: 25
		
//	Ex-4  Add 10 to each Number and Print
		 List<Integer> numbers = Arrays.asList(5, 10, 15);
		 
		 Consumer<Integer>addTen=(n)->System.out.println(n+10);
		 numbers.forEach(addTen);
	}
}
