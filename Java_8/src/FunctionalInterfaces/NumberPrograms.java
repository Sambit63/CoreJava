package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberPrograms {

	public static void main(String[] args) {
//		P1->Print Prime Numbers
		List<Integer> nums=Arrays.asList(1,2,6,3,8,12,45,65,33,31);
		Predicate<Integer> isPrime=(n)->{
			if(n<=1)return false;
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)return false;
			}
			return true;
		};
		System.out.println(nums.stream().filter(isPrime).toList());
		
//		P2->Factorial Of Numbers
		List<Integer> num1=Arrays.asList(2,4,5,6,7);
		Function<Integer, Integer>factorial=n->{
			int fact=1;
			for(int i=2;i<=n;i++)fact*=i;
			return fact;
		};
		Consumer<Integer>printFact=n->{
			System.out.println(n+" Factorial is "+factorial.apply(n));
		};
		num1.forEach(printFact);
		
		
//		P3->Number to Binary
		List<Integer> num2=Arrays.asList(10,9,5,6,12);
		Function<Integer, String>toBin=n->Integer.toBinaryString(n);
		Consumer<Integer>printBin=n->System.out.println(n+" to Binary is "+toBin.apply(n));		
		num2.forEach(printBin);
		
//		P4->Filter the Multiple of 3 Square them and Print
		List<Integer> num3 = Arrays.asList(2, 3, 4, 6, 9);
		Predicate<Integer> mul3=n->n%3==0;
		Function<Integer, Integer> cube=n->n*n*n;
		Consumer<Integer> print=n->System.out.println("Cube is "+n);
		num3.stream().filter(mul3)
		.map(cube)
		.forEach(print);
		//Cube is 27
		//Cube is 216
		//Cube is 729
	}
}
