package com.MultiThreading;
class A
{
	public synchronized static void m1(String s)
	{
		for(int i=1;i<=5;i++)System.out.println("M1()- Executed By: "+s);
	}
}
class MyThread extends Thread
{
	A a;
	String s;
	public MyThread(A a, String s) {
		this.a = a;
		this.s = s;
	}
	public void run()
	{
		a.m1(s);
	}
}
public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a =new A();
		A a1=new A();
		MyThread t1=new MyThread(a," T1 ");
		MyThread t2=new MyThread(a1, " T2 ");
		t1.start();
		t2.start();
	}

}
