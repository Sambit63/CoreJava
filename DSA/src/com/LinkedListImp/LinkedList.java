package com.LinkedListImp;

public class LinkedList {
	Node head;
	Node tail;
	private int count=0;
//	1
	public boolean isEmpty()
	{
		return count==0;
	}
//	2
	public int size()
	{
		return count;
	}
//	3
	public void add(Object el)
	{
	Node n=new Node(el);
		if(head==null)
		{
			head=n;
			count++;
			tail=n;
			return;
		}
		tail.next=n;
		count++;
		tail=n;
	}
//	4
	public void add(int in,Object el)
	{
		if(in<0 || in>=size())throw new IndexOutOfBoundsException();
		if(in==0)
		{
			head=new Node(el,head);
			count++;
			return;
		}
		Node curr=head;
		for(int i=1;i<in;i++)curr=curr.next;
		curr.next=new Node(el,curr.next);
		count++;
	}
//	5
	public void remove(int in)
	{
		if (in < 0 || in >= size()) 
			throw new IndexOutOfBoundsException();		
		if(in==0)
		{
			head=head.next;
			count--;
			return;
		}
		Node curr=head;
		for(int i=1;i<in;i++)curr=curr.next;
		if(in==size()-1)
		{
			tail=curr;
			curr.next=null;
			count--;
			return;
		}
		curr.next=curr.next.next;
		count--;
	}
//	6
	public Object get(int in)
	{
		if(in<0 || in>=size())throw new IndexOutOfBoundsException();
		Node curr=head;
		for(int i=1;i<=in;i++)curr=curr.next;
		return curr.data;
	}
//	7
	public void reverse()
	{
		Node curr=head;
		Node prev=null;
		Node next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		tail=head;
		head=prev;
	}
	public boolean contains(Object el)
	{
		if(count==0)return false;
		Node curr=head;
		while(curr!=null)
		{
			if(curr.data.equals(el))return true;
			curr=curr.next;
		}
		return false;
	}
	public void display()
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
//		l.add(4, 100);
		l.reverse();
		l.add(60);
//		l.remove(4);
//		System.out.println(l.contains(50));
//		System.out.println(l.tail.data);
//		l.display();
		
		
	}
}
