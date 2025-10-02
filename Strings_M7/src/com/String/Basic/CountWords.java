package com.String.Basic;

public class CountWords {

	public static int countWords(String s)
	{
		int count=1;
		
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java  is Not  a  easy language";
		
		System.out.println("total word present is: "+countWords(s));
	}

}
