package com.String.Builtin;

public class Panagram {
public static boolean isPanagram(String s1)
{
	if(s1.length()<26)return false;
	s1=s1.toLowerCase();
	for(char ch='a';ch<='z';ch++)
	{
		if(!s1.contains(ch+""))return false;
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="abcedfeghijklmnopqrstuvwxyz";
		String s1="A Quick Brown fox jumps over the lazy dog";
		System.out.println(isPanagram(s1));
	}

}
