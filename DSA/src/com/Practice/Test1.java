package com.Practice;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Test1 {
	
	public static boolean isValid(String s,String exp)
	{
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		return m.matches();
	}
	public static void rev(String s)
	{
		char[] ch=s.toCharArray();
		int i=s.length()/2;
		int j=s.length()-1;
		while(i<j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		System.out.println(new String(ch));
	}
	public static void main(String[] args) {
//		String s="sam@bit1";
		String exp="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+]).{4,8}";
//		System.out.println(isValid(s, exp));
		String str="sambit";
		rev(str);
	}
}
