package com.QueueImplementation;
class EmptyQueueException extends RuntimeException{}
public class QueueUsingAL {
	Object[] arr=new Object[10];
	int index=0;
	public void add(Object el)
	{
		if(index>=arr.length)increase();
		arr[index++]=el;
	}
	private void increase()
	{
		Object[] temp=new Object[((arr.length*3)/2)+1];
		for(int i=0;i<arr.length;i++)temp[i]=arr[i];
		arr=temp;
	}
	public Object peek()
	{
		if(index==0)throw new EmptyQueueException();
		return arr[0];
	}
	public Object poll()
	{
		Object temp=arr[0];
		for(int i=0;i<size();i++)arr[i]=arr[i+1];
		arr[index-1]=null;
		index--;
		return temp;
	}
	public int size()
	{
		return index;
	}
	public boolean isEmpty()
	{
		return index==0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingAL q=new QueueUsingAL();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		
		System.out.println(q.peek());
		while(!q.isEmpty())System.out.print(q.poll()+" ");
		System.out.println(q.size());
	}
}
