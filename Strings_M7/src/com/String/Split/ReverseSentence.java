package com.String.Split;

public class ReverseSentence {
	public static void reverse(String s)
	{
		String[] str=s.split(" ");
		for(int i=str.length-1;i>=0;i--)System.out.print(str[i]+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is very easy";
		reverse(s);
	}

}
