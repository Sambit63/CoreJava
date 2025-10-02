package com.String.Basic;

public class ReverseWords {
	static String reverse1(String s)
	{
		String res="";
		int j=0,i=0;
		while(j<s.length())
		{
			while(j<s.length() && s.charAt(j)!=' ')
				j++;
			int k=j-1;
			while(k>=i)
			{
				res+=s.charAt(k);
				k--;
			}
			if(j<s.length())res+=" ";
			j++;
			i=j;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res="Java is easy";
		System.out.println(reverse1(res));
		System.out.println("====================");
	}

}
