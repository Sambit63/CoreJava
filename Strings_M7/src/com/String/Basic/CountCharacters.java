package com.String.Basic;

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="@Sambit#20$";
		int uc=0,lc=0,nc=0,sc=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')uc++;
			else if(ch>='a'&& ch<='z')lc++;
			else if(ch>='0'&&ch<='9')nc++;
			else sc++;
		}
		System.out.println("Upper count: "+uc);
		System.out.println("Lower count: "+lc);
		System.out.println("Number count: "+nc);
		System.out.println("Special count: "+sc);
	}

}
