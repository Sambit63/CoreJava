package com.String.Basic;

public class SumOfNum {
	public static int sum(String s)
	{
		int sum=0;
		String sNum="";
		for(int i=0;i<s.length();i++)
		{
			 char ch = s.charAt(i);
	         if (ch >= '0' && ch <= '9')sNum+=ch;
	         else
	         {
	        	 if(!sNum.equals(""))
	        	 {
	        		 sum+=Integer.parseInt(sNum);
	        		 sNum="";
	        	 }
	         }
		}
//		add last number if string ends with digits
		if(!sNum.equals(""))
		{
			sum+=Integer.parseInt(sNum);
		}
		return sum;
	}
	public static void sumOfDigit(String s)
	{
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')sum+=ch-'0';
		}
		System.out.println("Sum = "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="S5am123bi12t";
	System.out.println(sum(s));//40
	sumOfDigit(s);//Sum = 14
	}
}
