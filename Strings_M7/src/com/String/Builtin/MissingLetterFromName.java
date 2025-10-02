package com.String.Builtin;

public class MissingLetterFromName {
	public static void missings(String s1,String s2)
	{
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(!s2.contains(ch+""))System.out.print(ch);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sambit";
		String s2="Smt";
		missings(s1,s2);//abi
	}
}
