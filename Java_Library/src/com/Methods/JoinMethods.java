package com.Methods;
class T1 extends Thread
{
	public void run()
	{
		try {
			JoinMethods.t2.join();
		} catch (InterruptedException e) {
		}
		for(int i=1;i<=5;i++)System.out.println("T1 : "+i);
	}
}
class T2 extends Thread
{
	public void run()
	{
		try {
			JoinMethods.m.join();
		} catch (InterruptedException e) {
		}
		for(int i=1;i<=5;i++)System.out.println("T2 : "+i);
	}
}
public class JoinMethods {
	static T1 t1;
	static T2 t2;
	static Thread m;
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		m=Thread.currentThread();
		t1=new T1();
		t2=new T2();
		t1.start();
		t2.start();
		for(int i=1;i<=5;i++)System.out.println("Main Thread :"+i);
	}

}
