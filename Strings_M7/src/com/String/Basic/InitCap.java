package com.String.Basic;

public class InitCap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is very difficult";
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				if(i==0 || ch[i-1]==' ')ch[i]-=32;
			}
		}
		System.out.println(ch);
	}

}
