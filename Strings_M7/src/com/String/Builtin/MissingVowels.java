package com.String.Builtin;

public class MissingVowels {
	static void missingVowel(String s1)
	{
		String s2="aeiouAeiou";
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			if(!s1.contains(ch+""))System.out.print(ch);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		missingVowel("Sambit");
	}

}
