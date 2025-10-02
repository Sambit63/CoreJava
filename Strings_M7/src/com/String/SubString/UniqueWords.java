package com.String.SubString;

public class UniqueWords {
	public static void unique(String s)
	{
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			boolean flag=false;
			if(str[i]==" ")continue;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					flag=true;
					str[j]=" ";
				}
			}
			if(flag)str[i]="";
			else System.out.print(str[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is very easy java very";
		unique(s);
	}
}
