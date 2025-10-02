package com.CollectorsClass;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CollectorsDemo {
	public static void main(String[] args) {
//		1.Collecting to a List
		List<String> names=Arrays.asList("Sam","Alice","Bob","Alex");
		List<String> res=names.stream()
				.filter(x->x.startsWith("A"))
				.collect(Collectors.toList());
		System.out.println(res); //[Alice, Alex]
		
//		2.Collecting to a Set
		List<Integer> nums=Arrays.asList(1,22,4,1,22,6,9,6);
		Set<Integer> res1=nums.stream().collect(Collectors.toSet());
		System.out.println(res1);//[1, 4, 22, 6, 9]
		
//		3.Collecting to a Specific Collection
		ArrayDeque<String> collect1= names.stream().collect(Collectors.toCollection(()->new ArrayDeque<>()));
		System.out.println(collect1);//[Sam, Alice, Bob, Alex]
		
//		4. Joining Strings
		String concatName=names.stream().map(String::toUpperCase).collect(Collectors.joining(","));
		System.out.println(concatName);//SAM,ALICE,BOB,ALEX
		
//		5.Summarizing Data
//		Generates statistical summary (count,sum,min,average,max)
		List<Integer> numbers=Arrays.asList(2,3,5,7,11);
		IntSummaryStatistics stats=numbers.stream().collect(Collectors.summarizingInt(x->x));
		System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());
        
//      6.Calculate Average
        Double avg=numbers.stream().collect(Collectors.averagingDouble(x->x));
        System.out.println("Averagre :"+avg);//Averagre :5.6
        
//      7.Counting Elements
        Long count=numbers.stream().collect(Collectors.counting());
        System.out.println("Count :"+count);//Count :5
        
//      8.Grouping Elements
        List<String> words=Arrays.asList("hello","world","java","streams","collectors");
        System.out.println(words.stream()
        		.collect(Collectors
        				.groupingBy(String::length)));
        //{4=[java], 5=[hello, world], 7=[streams], 10=[collectors]}
        
        System.out.println(words.stream()
        		.collect(Collectors
        				.groupingBy(String::length,Collectors.joining(","))));
        //{4=java, 5=hello,world, 7=streams, 10=collectors}
        System.out.println(words.stream()
        		.collect(Collectors
        				.groupingBy(String::length,Collectors.counting())));
        //{4=1, 5=2, 7=1, 10=1}
        
        TreeMap<Integer, Long>treeMap=words.stream()
        		.collect(
        				Collectors
        				.groupingBy(String::length, TreeMap::new,Collectors.counting()));
        System.out.println(treeMap);
        //{4=1, 5=2, 7=1, 10=1}
        
        
//      9.Partitioning Elements
        System.out.println(words.stream()
        		.collect(
        				Collectors
        				.partitioningBy(x->x.length()>5)));
        //{false=[hello, world, java], true=[streams, collectors]}
        
//      10.Mapping and Collecting
        //Applies a mapping function before collecting
        System.out.println(words.stream()
        		.collect(
        				Collectors.mapping(x->x.toUpperCase(), Collectors.toList())));
        //[HELLO, WORLD, JAVA, STREAMS, COLLECTORS]
        
        
        
   
//        Example 1:Collecting names based on length
        List<String> names1=Arrays.asList("Anna","Bravo","Smith","Alexander","Harry","Perry");
        System.out.println(names1.stream().collect(Collectors.groupingBy(String::length)));
        //{4=[Anna], 5=[Bravo, Smith, Harry, Perry], 9=[Alexander]}
        
//        Example 2: Counting Occurence of words
        String sentence="hello world hello java world";
        System.out.println(
        		Arrays.stream(sentence.split(" "))
        		.collect(Collectors.groupingBy(x->x,Collectors.counting()))
        		);
        //{java=1, world=2, hello=2}
     
//	     Example 3:Partitioning even and odd numbers
        List<Integer> l2=Arrays.asList(1,2,3,4,5,6);
        System.out.println(
        		l2.stream()
        		.collect(Collectors.partitioningBy(x->x%2==0))
        		);
        //{false=[1, 3, 5], true=[2, 4, 6]}
        
//      Example 4:Summing values in a Map
        Map<String, Integer> items=new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);
        
        System.out.println("The total fruits are using reduce :"+
        items.values()
        .stream()
        .reduce(Integer::sum).get());
//      The total fruits are using reduce :45
        //OR
        System.out.println("The total fruits are using Collectors.summingInt :"+
        items.values()
        .stream().collect(Collectors.summingInt(x->x)));
        //The total fruits are using Collectors.summingInt :45
        
//      Example 5:Find Length of Each Words.
        List<String> fruits=Arrays.asList("Apple","Banana","Watremelon");
        System.out.println(
        		fruits.stream()
        		.collect(Collectors.toMap(x->x.toUpperCase(), x->x.length())));
        //{APPLE=5, WATREMELON=10, BANANA=6}
        
//      Example 6:
        List<String> words2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(
        		words2.stream()
        		.collect(Collectors.toMap(k->k,v->1,(x,y)->x+y)));
        //{orange=1, banana=2, apple=3}
	}
}
