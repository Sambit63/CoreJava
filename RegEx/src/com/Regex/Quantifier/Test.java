package com.Regex.Quantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void test(String s,String exp)
	{
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())System.out.print(m.group()+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="aaAaAbBbBcDef";
//		String exp="([a-z])([A-Z])\\1";
//		test(s,exp); //aAa bBb 
		
//		String s="aaAACbBBbBcDef";
//		String exp="([a-z])([A-Z])\\2";
//		test(s,exp); //aAA bBB 
		
		String s="banana";
		String exp="([a-z][a-z])\\1";
		test(s,exp); //anan
	
	}

}
