package com.String.Basic;

public class OccurenceOfCharacter {
	public static void occurence(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			int count =1;
			if(ch[i]=='\u0000')continue;
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\u0000';
				}
			}
			System.out.println(ch[i]+" = "+count);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		occurence("javadev");
	}

}
