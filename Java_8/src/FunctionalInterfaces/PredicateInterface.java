package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> p1=i->i.toUpperCase().startsWith("S");
		Predicate<String> p2=i->i.toUpperCase().endsWith("T");
		Predicate<String> and=p1.and(p2);
		System.out.println(and.test("Sambik"));
		
		 Predicate<Integer> isEven = x -> x % 2 == 0;

	        System.out.println(isEven.test(4)); // true
	        System.out.println(isEven.test(7)); // false

	        Predicate<Integer> isPositive = x -> x > 0;
	        Predicate<Integer> isEvenAndPositive = isEven.and(isPositive);

	        System.out.println(isEvenAndPositive.test(4)); // true
	        System.out.println(isEvenAndPositive.test(-4)); // false
	        
//	        Filter names Starts With A
//			Filter Name Starts With A
			List<String> names=Arrays.asList("Sambit","Ana","Alex","Ana","Bob");
			Predicate<String> startA=(name)->name.startsWith("A");
			List<String> result=names.stream().filter(startA).toList();
			System.out.println(result);
	}

}
