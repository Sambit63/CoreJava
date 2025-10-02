package com.StackImplementation;

import java.util.EmptyStackException;

public class StackImp1 {
	Node head;
	int count=0;
	public void push(Object el)
	{
		if(count==0)
		{
			head=new Node(el,null);
			count++;
			return;
		}
		Node curr=head;
		while(curr.next!=null)curr=curr.next;
		curr.next=new Node(el,null);
		count++;
	}
	public Object peek()
	{
		if(head==null)throw new EmptyStackException();
		Node curr=head;
		while(curr.next!=null)curr=curr.next;
		return curr.data;
	}
	public Object pop()
	{
		if(head==null)throw new EmptyStackException();
		Node curr=head;
		Node prev=null;
		while(curr.next!=null)
		{
			prev=curr;
			curr=curr.next;
		}
		Object top=curr.data;
		prev.next=null;
		count--;
		return top;
	}
	public int size()
	{
		return count;
	}
	public boolean isEmpty()
	{
		return count==0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImp1 s=new StackImp1();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.size());
	}

}
