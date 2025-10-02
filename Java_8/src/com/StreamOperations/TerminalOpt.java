package com.StreamOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOpt {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 2, 7, 1);

//		1.collect
		System.out.println(list.stream().skip(1).toList());// [2, 3, 4]
		// or
		System.out.println(list.stream().collect(Collectors.toList()));

//		2.foEach
		list.stream().forEach(x -> System.out.print(x + " "));// 1 2 3 4

//		3reduce :Combines Elements to produce a single result
		Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
		System.out.println(optionalInteger.get());// 1 2 3 4 10
		// or
		Optional<Integer> option = list.stream().reduce((x, y) -> x + y);
		System.out.println(option.get());

//		4.count
		System.out.println(list.stream().filter(x -> x % 2 == 0).count());// 2

//		5.anyMatch, allMatch , nonMatch
		boolean b = list.stream().anyMatch(x -> x == 4);
		System.out.println(b);// true

		System.out.println(list.stream().allMatch(x -> x > 0));// true

		System.out.println(list.stream().noneMatch(x -> x > 0));// false

//		6.finFirst , findAny
		System.out.println(list.stream().findFirst().get());// 1
		System.out.println(list.stream().findAny().get());

//		7.toArray()
		Stream.of(1, 2, 3, 4).toArray();

//		8.min(),max()
		System.out.println(Stream.of(2, 4, 1, 7, 0).max((x, y) -> x - y).get());// 7
		System.out.println(Stream.of(2, 4, 1, 7, 0).min(Comparator.naturalOrder()).get());// 0
		// Comparator.naturalOrder() (x,y)->x-y;
		
//		9.forEachOrdered
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		System.out.println("Using for Each with parallel stream");
//		numbers.parallelStream().forEach(x->System.out.print(x+" "));//3 5 2 4 1
		System.out.println("Using forEachOrdered with parallel stream");
		numbers.parallelStream().forEachOrdered(x->System.out.print(x+" "));
		//1 2 3 4 5
	}

}
