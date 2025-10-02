package com.Regex.Quantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintSlaces {
	public static void slaces(String s,String exp)
	{
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())
			System.out.println(m.group());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="adcv\\jcnic\\cbic\\jcbic\\";
		String exp="\\\\";
		slaces(s,exp);
	}

}
