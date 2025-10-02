package com.Regex;

import java.util.regex.*;

public class Test {
//	Count total pairs
	public static void test1(String s, String exp) {
		int count = 0;
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		while (m.find()) {
			count++;
		}
		System.out.println(exp+" = "+count);
	}
	public static void test2(String s, String exp) {
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.println(m.group());
		}
	}
	public static void main(String[] args) {

//		String s="abcdefabef";
//		String exp="ab";
//		test1(s,exp);
		
//		String s="abcdefacaefa1aab";
//		String exp="a..";
//		test2(s,exp);
		
//		String s="abcdefacaefa1aab";
//		String exp="[ab]";
//		test2(s,exp);
		
//		String s="abc.defac.aefa1.aab";
//		String exp="[.]";
//		test2(s,exp);
		
		String s="abc1Abrfyer263hff7P4yuv98y18h9g";
		String exp=".[0-9].";
		String exp1=".[A-Z][0-9]";
		test2(s,exp1);
	}

}
