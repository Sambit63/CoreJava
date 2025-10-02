package com.StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupWords {
	static String s1="";
	public static void main(String[] args) {
		String s="java is very very easy java :)";
		String str[]=s.split(" ");
		
		List<String> l=Arrays.asList(str);
		l.stream().distinct().forEach(i->s1+=i+" ");
		System.out.println(s1.trim());
		
	}
}
