package com.String.SubString;

public class PrintSubStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="javadev";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+3;j<=s.length();j++)
			{
				System.out.println(s.substring(i, j));
			}
		}
	}

}
