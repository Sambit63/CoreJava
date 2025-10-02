package com.CollectionFramework;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> q=new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(q.pollFirst());
		System.out.println(q.pollLast());
		System.out.println(q.peekFirst());
		System.out.println(q.peekLast());
		System.out.println(q);
	}
}
