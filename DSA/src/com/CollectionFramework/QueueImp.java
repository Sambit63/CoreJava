package com.CollectionFramework;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new ArrayDeque<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(10);
		System.out.println(q.size());
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println("====================");
		System.out.println(q);
	}

}
