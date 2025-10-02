package com.String.Basic;

public class ReverseSentence {
	static String reverse(String s)
	{
		String res=" ";
		int i=s.length()-1,j=i;
		while(i>=0)
		{
			while(i>=0 && s.charAt(i)!=' ')i--;
			int k=i+1;
			while(k<=j)
			{
				res+=s.charAt(k);
				k++;
			}
			if(i>=0)res+=" ";
			i--;
			j=i;
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is easy";
		System.out.println(reverse(s));
	}

}
