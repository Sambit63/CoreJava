package com.MultiThreading;

class Bank {
	int bal;

	public Bank(int bal) {
		this.bal = bal;
	}

	synchronized public void withdraw(int amount) {
		if (amount > bal) {
			System.out.println("Less Bal...");
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		
			bal -= amount;
			System.out.println("Withdraw done : " + amount);
			System.out.println("Available Bal : " + bal);
		
	}

	synchronized public void deposit(int amount) {
		System.out.println("Going to deposit");
		bal += amount;
		notify();
		System.out.println("Deposit done of "+amount);
	}
}

public class InterThreadComm {

	public static void main(String[] args) {
		Bank b = new Bank(5000);
		new Thread() {
			@Override
			public void run() {
				b.withdraw(10000);
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				b.deposit(5000);
			}
		}.start();
	}

}
