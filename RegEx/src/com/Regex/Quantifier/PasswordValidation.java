package com.Regex.Quantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
	public static boolean isValid(String s,String exp)
	{
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		if(m.matches()) return true;
		else return false;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+]).{4,8}";
		String s="@Sambit1";
		if(isValid(s,exp))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}