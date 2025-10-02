package com.RunnableInterface;

class T1 implements Runnable
{
	@Override
	public void run() {
		for(char ch='a';ch<='e';ch++)System.out.println("Child Thread : "+ch);
	}	
}
public class Demo {
	public static void main(String[] args) {
		T1 t1=new T1();
//		t1.start();//CTE
		Thread t=new Thread(t1);
		t.start();
		for(int i=1;i<=5;i++)System.out.println("main Thread : "+i);
	}
}
//main Thread : 1
//Child Thread : a
//main Thread : 2
//Child Thread : b
//main Thread : 3
//main Thread : 4
//main Thread : 5
//Child Thread : c
//Child Thread : d
//Child Thread : e