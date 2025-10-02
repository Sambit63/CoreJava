package com.String.Basic;

public class Test {
//	Arrange the characters in Ascending order
	public static void ArrangeChs(String s)
	{
		String lc="",uc="",nc="",sc="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z')lc+=ch;
			else if(ch>='A' && ch<='Z')uc+=ch;
			else if(ch>='0' && ch<='9')nc+=ch;
			else sc+=ch;
		}
		String sort=sc+nc+lc+uc;
		System.out.println(sort);
	}
	
//	Arrange the Strings in Ascending order
	public static String sort(String s)
	{
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length()-1;i++)
		{			
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		return new String(ch);
	}
	
//	Case Conversion
	public static String toUpper(String s)
	{
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]>='a' && ch[i]<='z')ch[i]-=32;
		}
		return new String(ch);
	}
	public static String toLower(String s)
	{
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')ch[i]+=32;
		}
		return new String(ch);
	}
	
//	Count total words in a String without Using function
	public static int countWord(String s)
	{
		int count=1;
		for(int i=0;i<s.length();i++)
		{			
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')count++;
		}
		return count;
	}
	
//	First Charcater of a word to Upper Case
	public static String initCap(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]>='a' &&ch[i]<='z')
			{
				if(i==0 || ch[i-1]==' ')ch[i]-=32;
			}
		}
		return new String(ch);
	}
	
//	find The missing letters of original name
		public static void missings(String s1,String s2)
		{
			for(int i=0;i<s1.length();i++)
			{
				char ch=s1.charAt(i);
				if(!s2.contains(ch+""))System.out.print(ch);
			}
		}
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//			String s1="Sambit";
//			String s2="Smt";
//			missings(s1,s2);//abi
//		}
//	}	
	public static void main(String[] args) {
		String s="Java  is Not  a  easy language";		
		System.out.println(initCap(s));
	}
}
