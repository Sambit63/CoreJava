package com.String.Builtin;

public class SecMaxOccurChar {
	public static void secMaxChar(String s1)
	{
		String s2="";
		int max1=0,max2=0;
		char maxChar1=' ',maxChar2=' ';
		while(s1.length()>0)
		{
			char ch=s1.charAt(0);
			s2=s1.replace(ch+"", "");
			int count =s1.length()-s2.length();
			System.out.println(ch+" = "+count);
			if(count>max1)
			{
				max2=max1;
				max1=count;
				maxChar2=maxChar1;
				maxChar1=ch;
			}
			else if(count>max2 && count!=max1)
			{
				max2=count;
				maxChar2=ch;
			}
			s1=s2;
		}
		System.out.println("===========");
		System.out.println(maxChar1+" = "+max1);
		System.out.println(maxChar2+" = "+max2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="jjjaavva";
		secMaxChar(s);
	}

}
