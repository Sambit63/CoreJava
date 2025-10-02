package com.String.Builtin;

public class RemoveDuplicate {
	static void removeDup(String s)
	{
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(s2.indexOf(ch+"")==-1)s2+=ch;
		}
		System.out.println(s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeDup("javadev");
	}

}
