package com.Regex.Quantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPhno {
	public static void phnos(String s,String exp)
	{
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())
			System.out.println(m.group());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcbba9348158528c4200074923vnewie6370299336iucb7077321712cbi";
		String exp="[9876][0-9]{9}";
		phnos(s,exp);
	}

}
