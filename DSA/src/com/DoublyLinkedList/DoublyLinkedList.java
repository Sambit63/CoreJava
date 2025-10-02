package com.DoublyLinkedList;

class Node
{
	Node prev;
	Object data;
	Node next;
	public Node(Node prev, Object data, Node next) {
		this.prev = prev;
		this.data = data;
		this.next = next;
	}
	public Node(Object data)
	{
		this.data=data;
	}
}
public class DoublyLinkedList {
	Node head;
	Node tail;
	private int count=0;
//	1
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
		n.prev=tail;
		count++;
		tail=n;
	}
//	2
	public void add(int in,Object el)
	{
		if(in<0 || in>size())throw new IndexOutOfBoundsException();
		if(in==0)
		{
			Node temp=new Node(null,el,head);
			head.prev=temp;
			head=temp;
			count++;
			return;
		}
		Node curr=head;
		for(int i=1;i<in;i++)curr=curr.next;
		curr.next=new Node(curr,el,curr.next);
		count++;
	}
//	3
	public void remove(int in)
	{
		if (in < 0 || in >= size()) throw new IndexOutOfBoundsException();
		if(in==0)
		{
			head=head.next;
			if(head!=null)head.prev=null;
			else tail=null;
			count--;
			return;
		}
		Node curr=head;
		for(int i=1;i<in;i++)curr=curr.next;
		if(in==size()-1)
		{
			curr.next=null;
			count--;
			tail=curr;
			return;
		}
		curr.next=curr.next.next;
		curr.next.prev=curr;
		count--;
	}
//	4
	public Object get(int in)
	{
		Node curr=head;
		for(int i=1;i<=in;i++)curr=curr.next;
		return curr.data;
	}
//	5
	public int size()
	{
		return count;
	}
//	6
	public boolean isEmpty()
	{
		return count==0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList d=new DoublyLinkedList();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.add(50);
		d.remove(4);
		d.add(60);
		System.out.println(d.size()+"============================");
		for(int i=0;i<d.size();i++)System.out.print(d.get(i)+" ");		
	}
}
