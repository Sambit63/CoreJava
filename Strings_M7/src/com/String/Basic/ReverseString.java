package com.String.Basic;

public class ReverseString {
	public static String reverseString(String s) {
		String res = "";
		for (int i = s.length() - 1; i >= 0; i--)
			res += s.charAt(i);
		return res;
	}

//Reverse Only right half of the String
	public static String revRight(String s) {
		int i = s.length() / 2, j = s.length() - 1;
		char ch[] = s.toCharArray();
		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		return new String(ch);
	}

	public static String revLeft(String s) {
		int i = 0, j = s.length() / 2 - 1;
		char[] ch = s.toCharArray();
		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		String s = "Sambit";
		System.out.println(reverseString(s));//tibmaS
		System.out.println(revRight(s));//Samtib
		System.out.println(revLeft(s));//maSbit
	}
}
