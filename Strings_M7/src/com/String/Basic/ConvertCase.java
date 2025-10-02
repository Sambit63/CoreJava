package com.String.Basic;

public class ConvertCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="jAVA";
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')ch[i]-=32;
			else if(ch[i]>='A'&&ch[i]<='Z')ch[i]+=32;
		}
		System.out.println(ch);
	}

}
