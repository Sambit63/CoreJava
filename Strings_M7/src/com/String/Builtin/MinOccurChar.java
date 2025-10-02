package com.String.Builtin;

public class MinOccurChar {
	static void minOccur(String s1)
	{
		String s2="";
		int min=s1.length();
		char minChar=' ';
		while(s1.length()>0)
		{
			char ch=s1.charAt(0);
			s2=s1.replace(ch+"", "");
			int count=s1.length()-s2.length();
			System.out.println(ch+" = "+count);
			if(count<min)
			{
				min=count;
				minChar=ch;
			}
			s1=s2;
		}
		System.out.println("==============");
		System.out.println(minChar+" = "+min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="jjavvvaaaa";
		minOccur(s);
	}

}
