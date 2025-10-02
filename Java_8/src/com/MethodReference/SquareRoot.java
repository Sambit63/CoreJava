package com.MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SquareRoot {
	public static void main(String[] args) {
//		EX-1
//		Using Lamda Expression
		Function<Integer, Double> fun1=t->Math.sqrt(t);
		
//		Using Method Reference
		Function<Integer, Double> fun=Math::sqrt;		
		System.out.println(fun.apply(9));
		
		
//		Ex-2
//		Using Lamda Expression
		List<String> list=Arrays.asList("Sam ","Pikun ","Harry");
		list.forEach(i->System.out.print(i));
		
//		Using Method Reference
		list.forEach(System.out::print);
	}
}
