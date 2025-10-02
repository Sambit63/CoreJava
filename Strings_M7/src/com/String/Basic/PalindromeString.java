package com.String.Basic;
import java.util.*;
public class PalindromeString {

	public static boolean isPalindrome(String s1)
	{
		String s=s1.toLowerCase();
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new Scanner(System.in).next();
		System.out.println(isPalindrome(s));
	}

}
