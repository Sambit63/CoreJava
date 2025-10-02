package com.MethodReference;

import java.util.function.Function;

public class UpperCaseConvert {
//	Using static method
	public static String toUpper(String s)
	{
		return s.toUpperCase();
	}
	
//	Using non-static method
	public String toupper(String s)
	{
		return s.toUpperCase();
	}
	public static void main(String[] args) {
		Function<String, String> fun=UpperCaseConvert::toUpper;
		System.out.println(fun.apply("Sambit"));
		
		UpperCaseConvert u=new UpperCaseConvert();
		Function<String, String> fun1=u::toupper;
		System.out.println(fun1.apply("Sambit"));
	}

}
