
package com.String.SubString;

public class BigSubstrPalindrome {
	public static boolean isPalindrome(String s)
	{
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
	public static void bigSubPalindrom(String s)
	{
		String bigPalindrome="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+3;j<s.length();j++)
			{
				String s1=s.substring(i,j);
				if(isPalindrome(s1))
				{
					System.out.println(s1);
					if(s1.length()>bigPalindrome.length())bigPalindrome=s1;
				}
			}
		}
		System.out.println("=============");
		System.out.println(bigPalindrome);
	}
	public static void main(String[] args) {
//		System.out.println("==========");
		String s="malayalam";
		bigSubPalindrom(s);
	}

}
