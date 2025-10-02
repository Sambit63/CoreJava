package com.String.Builtin;

public class Test {
//	Anagram String
	// Without using recurssion
	public static boolean isAnagram(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		while (true) {
			if (s1.length() != s2.length())
				return false;
			if (s1.length() == 0 && s2.length() == 0)
				return true;
			char ch = s1.charAt(0);
			s1 = s1.replace(ch + "", "");
			s2 = s2.replace(ch + "", "");
		}
	}

	// Using recurssion
	public static boolean isAnagram1(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		if (s1.length() == 0 && s2.length() == 0)
			return true;
		char ch = s1.charAt(0);
		return isAnagram1(s1.replace(ch + "", ""), s2.replace(ch + "", ""));
	}
	
//	Panagram String
	public static boolean panagram(String s) {
//		s="A Quick Brown fox jumps over the lazy dog";
		s = s.toLowerCase();
		if (s.length() < 26)
			return false;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!s.contains(ch + ""))
				return false;
		}
		return true;
	}

//	Remove the duplicate character in a given String
	public static void removeDup(String s) {
		String res = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '\u0000')
				continue;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j])
					ch[j] = '\u0000';
			}
			res += ch[i];
		}
		System.out.println(res);
	}

//	Print only the Unique chracters
	public static void uniqueChar(String s) {
		String res = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			boolean flag = false;
			if (ch[i] == '\u0000')
				continue;
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {
					ch[j] = '\u0000';
					flag = true;
				}
			}
			if (flag)
				ch[i] = '\u0000';
			else
				res += ch[i];
		}
		System.out.println(res);
	}
	
//	Remove Extra spaces from a String
	public static String removeSpaces(String s)
	{
		String res="";
		int i=0;
		while(i<s.length())
		{
			while(i<s.length() && s.charAt(i)==' ')i++;
			int j=i;
			while(j<s.length() && s.charAt(j)!=' ')j++;
			if(i<j)
			{
				if(res!="")res+=" ";
				for(int k=i;k<j;k++)res+=s.charAt(k);
			}
			i=j;
		}
		return res;
	}
//	Biggest substring palindrome
	public static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static String bigSubStrPal(String s) {
		String bigPalindrome = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 3; j < s.length(); j++) {
				String s1 = s.substring(i, j);
				if (isPalindrome(s1)) {
					if (s1.length() > bigPalindrome.length())
						bigPalindrome = s1;
				}
			}
		}
		return bigPalindrome;
	}

//	Smallest substring Palindrome 
	public static String smallSubStrPal(String s) {
		String smallPal = "";
		int smallLen = s.length() - 1;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 3; j < s.length(); j++) {
				String s1 = s.substring(i, j);
				if (isPalindrome(s1)) {
					if (s1.length() < smallLen) {
						smallPal = s1;
						smallLen = s1.length();
					}
				}
			}
		}
		return smallPal;
	}

//	String Permutation
	public static String swap(String s,int i,int j)
	{
		char[] ch=s.toCharArray();
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return new String(ch);
	}
	public static void permutation(String s,int st,int end)
	{
		if(st==end)
		{
			System.out.println(s);
			return;
		}
		for(int i=st;i<=end;i++)
		{
			String s1=swap(s,st,i);
			permutation(s1,st+1,end);
		}
	}
	
	public static void perm(String s,int st,int end)
	{
		if(st==end)
		{
			System.out.println(s);
			return;
		}
		for(int i=st;i<=end;i++)
		{
			String s1=swap(s,st,i);
			perm(s1,st+1,end);
		}
	}
	public static String rev(String s)
	{
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res+=s.charAt(i);
		}
		return res;
	}
	public static void test(String s)
	{
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			System.out.print(rev(str[i])+" ");
		}
	}
	public static void test1(String s)
	{
		String[] str=s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TOj++DO Auto-generated method stub
		String s1="A Quick Brown fox jumps over the lazy dog";
		String s="  java  is very easy";
		System.out.println(removeSpaces(s));
	}

}
