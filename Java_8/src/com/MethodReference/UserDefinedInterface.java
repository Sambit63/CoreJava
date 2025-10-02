package com.MethodReference;
interface Printable
{
	void printt(String msg);
}
interface Returnable
{
	int returned(String s);
}

class Sample
{
	public void toUpper(String s)
	{
		s=s.toUpperCase();
		System.out.println(s);
	}
	public int len(String s)
	{
		return s.length();
	}
}
public class UserDefinedInterface {

	public static void main(String[] args) {
		Sample sample=new Sample();
		
		Printable p=sample::toUpper;
		p.printt("sambit");  //SAMBIT
		
		Returnable r=sample::len;
		System.out.println(r.returned("Sambit")); //6
	}
}
