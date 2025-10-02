package com.Regex.Quantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {

	public static void test(String s,String exp)
	{
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())System.out.print(m.group()+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="ababbbabba";
//		String exp="ab{2}";
//		test(s,exp); //abb abb
		
//		String s="ababbbaabbabb";
//		String exp="a{2}b";
//		test(s,exp); //aab 
		
//		String s="ababbbaabbabb";
//		String exp="ab{2,3}";
//		test(s,exp);//abbb abb abb 
		
//		String s="ababbbaabbabba";
//		String exp="ab{1,}";
//		test(s,exp); //ab abbb abb abb
	}

}
