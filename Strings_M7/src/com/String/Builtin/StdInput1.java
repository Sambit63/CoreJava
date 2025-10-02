package com.String.Builtin;

public class StdInput1 {
	static void replace(String s)
	{
		String res="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int total=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)==ch)total++;
			}
			if(total>1)
			{
				int count=0;
				for(int j=0;j<=i;j++)
				{
					if(s.charAt(j)==ch)count++;
				}
				res+=count;
			}
			else
			{
				res+=ch;
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello World";
		replace(s1);
	}

}
