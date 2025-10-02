package com.String.Recurssion;

public class StringPermutation {
	public static String swap(String s, int i, int j) {
		char ch[] = s.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return new String(ch);
	}

	public static void permutation(String s, int st, int end) {
		if (st == end) {
			System.out.println(s);
			return;
		}
		for (int i = st; i <= end; i++) {
			String s1 = swap(s, st, i);
			permutation(s1, st + 1, end);
		}
	}
	public static void permutation(String s) {
	    int n = s.length();

	    for (int i = 0; i < n; i++) {
	        String s1 = swap(s, 0, i);
	        for (int j = 1; j < n; j++) {
	            String s2 = swap(s1, 1, j);
	            System.out.print(s2+"  ");
	        }
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		permutation(s,0,s.length()-1);
//		permutation(s);
//		System.out.println(swap(s,0,1));
	}

}
