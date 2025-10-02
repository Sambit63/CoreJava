package com.Regex.Quantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumCheck {
	public static void checkNum(String s,String exp)
	{
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		if(m.matches())System.out.println("Valid");
		else System.out.println("Invalid");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="70773217124";
		String exp="[9876][0-9]{9}";
		checkNum(s,exp);
	}
}
