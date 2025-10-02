package com.String.SubString;

public class SmallSubstrPalindrome {
	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void smallPalindrome(String s) {
		String smallPal = "";
		int smallLength = s.length()+1;
		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 3; j < s.length(); j++) {

				String s1 = s.substring(i, j);
				if (isPalindrome(s1)) {
					System.out.println(s1);
					if (s1.length() < smallLength) {
						smallPal = s1;
						smallLength = s1.length();
					}
				}
			}
		}
		System.out.println("==================");
		System.out.println(smallPal + " = " + smallLength);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		smallPalindrome("mom");
		smallPalindrome("malayalam");
	}

}
