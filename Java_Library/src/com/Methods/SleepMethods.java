package com.Methods;

public class SleepMethods {
	
	public static void main(String[] args) throws InterruptedException {
		for(int i=1;i<=100;i++)
		{
			Thread.sleep(1000);
			System.out.println("Main Threads : "+i);
		}
	}
}
