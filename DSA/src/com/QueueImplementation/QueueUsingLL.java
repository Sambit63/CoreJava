package com.QueueImplementation;
class Node{
	Object el;
	Node next;
	public Node(Object el)
	{
		this.el=el;
	}
	public Node(Object el, Node next) {
		this.el = el;
		this.next = next;
	}	
}

public class QueueUsingLL {
	Node head;
	Node tail;
	int count;
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
	public Object peek()
	{
		if(count ==0)throw new EmptyQueueException();
		return head.el;
	}
	public Object poll()
	{
		if(count ==0)throw new EmptyQueueException();
		Object key=head.el;
		head=head.next;
		count--;
		return key;
	}
	public int size()
	{
		return count;
	}
	public boolean isEmpty()
	{
		return count ==0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLL q=new QueueUsingLL();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(10);
		q.add(40);
		System.out.println(q.size());
		System.out.println(q.peek());
		System.out.println(q.size());
		while(!q.isEmpty())System.out.print(q.poll()+" ");
		System.out.println();
		System.out.println(q.size());
	}
}
