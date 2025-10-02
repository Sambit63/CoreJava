package com.String.Builtin;

public class secMinOccurChar {
	public static void secMinChar(String s1) {
		String s2 = "";
		int min1 = s1.length(), min2 = min1;
		char minChar1 = ' ', minChar2 = ' ';
		while (s1.length() > 0) {
			char ch = s1.charAt(0);
			s2 = s1.replace(ch + "", "");
			int count = s1.length() - s2.length();
			System.out.println(ch + " = " + count);
			if (count < min1) {
				min2 = min1;
				min1 = count;
				minChar2 = minChar1;
				minChar1 = ch;
			} else if (count < min2 && count != min1) {
				min2 = count;
				minChar2 = ch;
			}
			s1 = s2;
		}
		System.out.println("============");
		System.out.println(minChar1+" = "+min1);
		System.out.println(minChar2+" = "+min2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="javavdev";
		secMinChar(s);
	}

}
