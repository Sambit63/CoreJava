package com.Programs;

import java.util.Arrays;
class T1 extends Thread
{
	@Override
	public void run()
	{
		try {
			Test.t2.join();
		} catch (InterruptedException e) {
		}
		for(int i=1;i<=5;i++)
		{
			System.out.println("T1 : "+i);
		}
	}
}
class T2 extends Thread 
{
	@Override
	public void run()
	{
		try {
			Test.t.join();
		} catch (InterruptedException e) {
		}
		for(int i=1;i<=5;i++)
		{
			System.out.println("T2 : "+i);
		}
	}
}
public class Test {
	static T1 t1;
	static T2 t2;
	static Thread t;
	public static void main(String[] args) {
		t=Thread.currentThread();
		t1=new T1();
		t2=new T2();
		t1.start();
		t2.start();
		for(int i=1;i<=5;i++)System.out.println("Main Thread : "+i);
	}
}
