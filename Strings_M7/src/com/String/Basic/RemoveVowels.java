package com.String.Basic;

public class RemoveVowels {
	static int countVowels(String s)
	{
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a' || c=='e'||c=='i'||c=='o'|| c=='u')count ++;
		}
		return count;
	}
public static void remove(String s)
{
	char[] ch=s.toCharArray();
	
	if(countVowels(s)>=3)
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e'||ch[i]=='i'||ch[i]=='o'|| ch[i]=='u')ch[i]='\u0000';
		}
	}
	System.out.println(new String(ch));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remove("javadev");
	}

}
