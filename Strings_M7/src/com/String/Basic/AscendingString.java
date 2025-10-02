package com.String.Basic;

public class AscendingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length()-1;i++)
		{			
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println(ch);
	}

}
