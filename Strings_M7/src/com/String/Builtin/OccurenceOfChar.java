package com.String.Builtin;

public class OccurenceOfChar {
	public static void occurence(String s1)
	{
		String s2="";
		while(s1.length()>0)
		{
			char ch=s1.charAt(0);
			s2=s1.replace(ch+"", "");
			System.out.println(ch+" = "+(s1.length()-s2.length()));
			s1=s2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="javadev";
		occurence(s);
	}
}
