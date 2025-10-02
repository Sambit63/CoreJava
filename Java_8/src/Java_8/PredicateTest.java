package Java_8;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer>p =i->i%2==0;
		
		System.out.println(p.test(7));
	}

}
