package com.String.Basic;

public class RemoveDuplicate {
	public static void remove(String s)
	{
		String res="";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]=='\u0000')continue;
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])ch[j]='\u0000';
			}
			res+=ch[i];
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remove("javad@ev ");
	}

}
