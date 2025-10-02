package com.PrimitiveStreams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStream {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,6};
		IntStream stream=Arrays.stream(numbers);
		stream.forEach(x->System.out.print(x+" "));
		//1 2 3 4 5 6 
		
		System.out.println(
				IntStream.range(1, 5)
				.boxed().collect(Collectors.toList()));
		//[1, 2, 3, 4]
		
		System.out.println(
				IntStream.rangeClosed(1, 5)
				.boxed().collect(Collectors.toList()));
		//[1, 2, 3, 4, 5]
		
		System.out.println(IntStream.of(1,2,3).boxed().toList());
		//[1, 2, 3]
		
		IntStream ints=new Random().ints(2);
		System.out.println(ints.boxed().toList());
		//[1146267076, -2134762422] Gives any two random numbers
		
		IntStream ints1=new Random().ints(2,1,10);
		System.out.println(ints1.boxed().toList());
	    //[5, 2] Gives any two random numbers between 1-10.
		
		
//		Summary Statistics
		IntStream ints2=new Random().ints(2,1,10);
		System.out.println("Sum = "+ints2.sum());
//		ints2.min();
//		ints2.max();
//		ints2.average();
//		ints2.count();
		
		DoubleStream doubles=new Random().doubles(2,1,10);
		doubles.mapToInt(x->(int)x+1).forEach(System.out::println);
//		9
//		6
	}
}

