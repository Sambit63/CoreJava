package com.String.Basic;

public class ArrangeCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Jsp@123#";
		String uc="",lc="",nc="",sc="";
		String out="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')uc+=ch;
			else if(ch>='a'&& ch<='z')lc+=ch;
			else if(ch>='0'&&ch<='9')nc+=ch;
			else sc+=ch;
		}
		out=sc+nc+lc+uc;
		System.out.println(out);
	}

}
