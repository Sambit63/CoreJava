package com.Regex.Quantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
	public static void test(String s,String exp)
	{
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())
			System.out.print(m.group()+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="ababbbabbbbbaab";
//		String exp="ab+"; //ab abbb abbbbb ab
//		String exp="ab*"; //ab abbb abbbbb a ab 
//		String exp="ab?"; //ab ab ab a ab
//		test(s,exp);
		
		String s="accbccabbbbbcccacabc";
		String exp="ab*c+";
		test(s,exp);//acc abbbbbccc ac abc 
	}

}
