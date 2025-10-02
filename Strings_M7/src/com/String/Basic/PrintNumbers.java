package com.String.Basic;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="R1a2m3";
		String num="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')num+=ch;
		}
		System.out.println("The number is: "+num);
	}

}
