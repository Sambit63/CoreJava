package com.String.Split;

public class RemoveDuplicateWord {
//	Using Split method
	public static void removeDuplicate(String s)
	{
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals(""))continue;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))str[j]="";
			}
			System.out.print(str[i]+" ");
		}
	}
//	Without using split Method
	public static int countWord(String s)
	{
		s=s.trim();
		int count=1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') count++;
		}
		return count;
	}
	public static void removeDup(String s)
	{
		String[] str=new String[countWord(s)];
		int index=0;
		int i=0,j=0;
		s=s.trim();
//		To Add the word inside the string array
		while(j<s.length())
		{
			while(j<s.length() && s.charAt(j)!=' ')j++;
			String res="";
			while(i<j)
			{
				res+=s.charAt(i);
				i++;
			}
			str[index++]=res;
			j++;
			i=j;
		}

//		To remove the duplicate word
		for(int k=0;k<str.length;k++)
		{
			if(str[k]=="")continue;
			for(int l=k+1;l<str.length;l++)
			{
				if(str[k].equals(str[l]))str[l]="";
			}
		}		
//		To Print the Final Output
		for(int k=0;k<str.length;k++)
		{
			if(!str[k].equals(""))System.out.print(str[k]+" ");
		}		
	}

	public static void main(String[] args) {
		String s="  java is very very easy java is java  ";
		removeDup(s);
	}
}
