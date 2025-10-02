 package com.StackImplementation;

import java.util.EmptyStackException;
class Node
{
	Object data;
	Node next;
	public Node(Object data) {
		this.data = data;		
	}
	public Node(Object data, Node next) {
		this.data = data;
		this.next = next;
	}	
}
public class StackImp {
	Node head;
	int count =0;
	public void push(Object el)
	{
		if(count==0)
		{
			head=new Node(el,null);
			count++;
			return;
		}
		head=new Node(el,head);
		count++;
	}
	public Object peek()
	{
		if(count==0)throw new EmptyStackException();
		return head.data;
	}
	
	public Object pop()
	{
		if(count==0)throw new EmptyStackException();
		Object top=head.data;
		head=head.next;
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
		StackImp s=new StackImp();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.peek());
		System.out.println(s.size());
		while(s.size()!=0)
		{
			System.out.println(s.pop());
		}		
	}
}
