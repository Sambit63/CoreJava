package com.StackImplementation;

import java.util.EmptyStackException;
public class StackUsingAL {
	Object[] arr=new Object[10];
	int index=0;
	public void push(Object el)
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
		if(index==0)throw new EmptyStackException();
		return arr[index-1];
	}
	public Object pop()
	{
		if(index==0)throw new EmptyStackException();
		Object key=arr[index-1];
		arr[index-1]=null;
		index--;
		return key;
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
		StackUsingAL s=new StackUsingAL();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.size());
		while(!s.isEmpty())System.out.print(s.pop()+" ");
		System.out.println("=========================");
		System.out.println(s.size());
	}
}
