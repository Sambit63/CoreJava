package com.String.Builtin;

import java.math.BigInteger;

public class RemoveSpaces {
	public static void removeExtra(String s) {
		String res = "";
		int i = 0;
		int n = s.length();

		while (i < n) {
			while (i < n && s.charAt(i) == ' ')
				i++;
			int j = i;
			while (j < n && s.charAt(j) != ' ')
				j++;
			if (i < j) {
				if (res != "")
					res += " ";
				for (int k = i; k < j; k++)
					res += s.charAt(k);
			}
			i = j;
		}

		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " Java is   easy ";
		removeExtra(s);

	}

}
