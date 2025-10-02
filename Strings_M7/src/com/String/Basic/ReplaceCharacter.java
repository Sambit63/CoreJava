package com.String.Basic;

public class ReplaceCharacter {
	public static String replace(String s,char c,char key)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]==c)ch[i]=key;
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="jAvA";
		System.out.println(replace(s,'A','$'));
	}

}
