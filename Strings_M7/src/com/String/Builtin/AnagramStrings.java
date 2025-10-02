package com.String.Builtin;

public class AnagramStrings {
	public static boolean isAnagram(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		while(true)
		{
			if(s1.length()!=s2.length())return false;
			if(s1.length()==0 && s2.length()==0)return true;
			char ch=s1.charAt(0);
			s1=s1.replace(ch+"", "");
			s2=s2.replace(ch+"", "");
		}
	}
	public static boolean isAnagram1(String s1,String s2)
	{
//		s1=s1.toLowerCase();
//		s2=s2.toLowerCase();
		if(s1.length()!=s2.length())return false;
		if(s1.length()==0 && s2.length()==0)return true;
		char ch=s1.charAt(0);
		return isAnagram(s1.replace(ch+"", ""),s2.replace(ch+"", ""));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Peek",s2="Keep";
		System.out.println(isAnagram1(s1.toLowerCase(),s2.toLowerCase()));
	}

}
