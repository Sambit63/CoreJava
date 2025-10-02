package com.String.SubString;

public class RemoveDuplicateWords {
	public static void removeDup(String s)
	{
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(str[i]=="")continue;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))str[j]="";
			}
			System.out.print(str[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Banglore is Banglore city";
		removeDup(s);
	}

}
