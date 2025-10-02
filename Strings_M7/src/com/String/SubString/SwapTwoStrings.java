package com.String.SubString;

public class SwapTwoStrings {
	public static void swap(String s1, String s2) {
		System.out.println("After swap");
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);

		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("After swap");
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sambit",s2="Kumar Sahoo";
		swap(s1,s2);
	}
}
