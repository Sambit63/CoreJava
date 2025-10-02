package com.MultiThreading;

class T1 extends Thread
{
	@Override
	public void run() {
		for(int i=0;i<=5;i++)System.out.println("Child Thread: "+i);
	}
}
public class Demo {	
	public static void main(String[] args) {
		T1 t=new T1();
		t.start();
		for(char ch='A';ch<='E';ch++)System.out.println("Main Thread : "+ch);
	}
}
//Main Thread : A
//Main Thread : B
//Child Thread: 0
//Main Thread : C
//Main Thread : D
//Child Thread: 1
//Main Thread : E
//Child Thread: 2
//Child Thread: 3
//Child Thread: 4
//Child Thread: 5