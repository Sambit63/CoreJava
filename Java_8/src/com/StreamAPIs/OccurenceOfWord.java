package com.StreamAPIs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurenceOfWord {
	public static void main(String[] args) {
		String s="java is very very easy java is";
		String[] str=s.split(" ");
		
		List<String> l=Arrays.asList(str);
		Map<String, Long> m=l.stream().collect(Collectors.groupingBy(i->i,()->new LinkedHashMap<>(),Collectors.counting()));
		m.forEach((i,j)->System.out.println(i+" = "+j));
	}
}
