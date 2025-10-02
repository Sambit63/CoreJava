package com.StreamAPIs;

import java.util.Arrays;
import java.util.List;

public class StringToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=Arrays.asList("sam","pikun","sambit");
//		l.stream().map(i->i.toUpperCase()).forEach(i->System.out.println(i));
		l.stream().map(String::toUpperCase).forEach(i->System.out.println(i));
	}

}
