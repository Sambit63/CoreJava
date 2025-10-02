package com.MethodReference;

import java.util.function.Function;

public class StringLength {
//	Using static method
	public static int len(String s)
	{
		return s.length();
	}
	
//	Using non-static method
	public int leng(String s)
	{
		return s.length();
	}
	public static void main(String[] args) {
		
		Function<String, Integer> fun1=StringLength::len;
		System.out.println(fun1.apply("Sambit"));
		
		StringLength str=new StringLength();
		Function<String, Integer> fun2=str::leng;
		System.out.println(fun2.apply("Pikun"));
	}
}
