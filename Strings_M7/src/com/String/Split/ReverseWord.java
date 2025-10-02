package com.String.Split;

public class ReverseWord {
	public static String reverse(String s)
	{
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res+=s.charAt(i);
		}
		return res;
	}
	public static void revWord(String s)
	{
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			System.out.print(reverse(str[i])+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(reverse());
		String s="java is very easy";
		revWord(s);
	}

}
