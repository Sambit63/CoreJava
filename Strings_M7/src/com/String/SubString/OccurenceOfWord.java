package com.String.SubString;

public class OccurenceOfWord {
	public static void occurence(String s) {
		int max = 0;
		String maxWord = "";
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			int count = 1;
			if (str[i] == " ")
				continue;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					count++;
					str[j] = " ";

				}
			}
			System.out.println(str[i] + " = " + count);
		}
	}

	public static void maxOccur(String s) {
		int max = 0;
		String maxWord = "";
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			int count = 1;
			if (str[i] == " ")
				continue;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					count++;
					str[j] = " ";
				}
			}
			if (count > max) {
				max = count;
				maxWord = str[i];
			}
		}
		System.out.println("The maximum occured word is: ");
		System.out.println(maxWord + " = " + max);
	}

	public static void secMaxOccr(String s) {
		int max1 = 0, max2 = 0;
		String maxWord1 = "", maxWord2 = "";
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			int count = 1;
			if (str[i] == " ")
				continue;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					count++;
					str[j] = " ";
				}
			}
			if (count > max1) {
				max2 = max1;
				max1 = count;

				maxWord2 = maxWord1;
				maxWord1 = str[i];
			} else if (count > max2 && count != maxWord1.length()) {
				maxWord2 = str[i];
				max2 = count;
			}
		}
		System.out.println("2nd max Occured character is: ");
		System.out.println(maxWord2 + " " + max2);
	}

	public static void minOccur(String s) {
		String[] str = s.split(" ");
		int min = str.length;
		String minWord = "";
		for (int i = 0; i < str.length; i++) {
			int count = 1;
			if (str[i] == " ")
				continue;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					count++;
					str[j] = " ";
				}
			}
			if (count < min) {
				min = count;
				minWord = str[i];
			}
		}
		System.out.println("The minimum occured character is: ");
		System.out.println(minWord + " = " + min);
	}

	public static void secMinOccr(String s) {
		String[] str = s.split(" ");
		int min1 = str.length, min2 = str.length;
		String minWord1 = "", minWord2 = "";
		for (int i = 0; i < str.length; i++) {
			int count = 1;
			if (str[i] == " ")
				continue;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					count++;
					str[j] = " ";
				}
			}
			if (count < min1) {
				min2 = min1;
				min1 = count;
				minWord2 = minWord1;
				minWord1 = str[i];
			} else if (count < min2 && count != minWord1.length()) {
				minWord2 = str[i];
				min2 = count;
			}
		}
		System.out.println("The second minimum word is: ");
		System.out.println(minWord2 + " = " + min2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java is is very very easy java very ";
		occurence(s);
		System.out.println("====================");
//		maxOccur(s);
//		System.out.println("====================");
//		secMaxOccr(s);
		minOccur(s);
		System.out.println("========================");
		secMinOccr(s);
	}

}
