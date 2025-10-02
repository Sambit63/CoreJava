package com.StreamPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StringPrograms {

	public static void main(String[] args) {
//		P1.Convert Strings to UpperCase
		List<String> str1=Arrays.asList("sam","Akshay","Alex");
		System.out.println(str1.stream().map(x->x.toUpperCase()).toList());
		
//		P2.String Started with "A"
		System.out.println(str1.stream().filter(x->x.startsWith("A")).toList());
		
//		P3.Remove Duplicate words
		String str2="java is very easy java is";
		System.out.println(
				Arrays.asList(str2.split(" "))
				.stream().distinct().toList()
				);

//		P4.Occurence Of Each Word
		Map<String, Long> freq1=Arrays.asList(str2.split(" "))
				.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println(freq1);
		
//		P5.Remove Duplicate Characters from String
		String str3="javadev";
		String res1=str3.chars().distinct().mapToObj(x->String.valueOf((char)x))
				.collect(Collectors.joining()).toString();
		System.out.println(res1);
		
//		P6.Occurence of Each Character
		Map<Character, Long>freq2=str3.chars().mapToObj(x->(char)x)
				.collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println(freq2);
		
//		P7.Find The Longest String
		List<String> str4 = Arrays.asList("stream", "java", "programming", "api");
		String res2=str4.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println(res2);
		
//		P8.Reverse Words in String
		String str6="java is very easy";
		String rev2=Arrays.asList(str6.split(" ")).stream()
				.map(x->new StringBuilder(x).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println(rev2);
		
//		P9.InitCap
		String str7="java is very easy";
		String initCap=Arrays.asList(str7.split(" ")).stream()
				.map(x->x.substring(0, 1).toUpperCase()+x.substring(1).toLowerCase())
				.collect(Collectors.joining(" "));
		System.out.println(initCap);
		
//		Find Palindrome Strings
		List<String> str8 = Arrays.asList("madam", "java", "level", "world", "radar");
		List<String> pal=str8.stream()
				.filter(x->x.equalsIgnoreCase(new StringBuilder(x).reverse().toString()))
				.toList();
		System.out.println(pal);
		
//		P10.Sort Words By Length
		List<String> str9 = Arrays.asList("java", "programming", "is", "fun");
		List<String> sort=str9.stream()
				.sorted(Comparator.comparingInt(String::length)).toList();
		System.out.println(sort);
		
//		P11.First Repeating Character
		String str10="javadev";
		Set<Character> set=new HashSet<>();
		System.out.println(str10.chars()
				.mapToObj(x->(char)x).
				filter(x->!set.add(x)).findFirst().get());
		
//		P12.First Non repeating Character
		Set<Character> set1=new HashSet<>();
		System.out.println(str10.chars()
				.mapToObj(x->(char)x).
				filter(x->set1.add(x)).findFirst().get());
		
		
	}
}
