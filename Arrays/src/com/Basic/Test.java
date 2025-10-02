package com.Basic;

import java.util.ArrayDeque;
import java.util.Queue;

class Node {
	Node left;
	int data;
	Node right;

	public Node(int data) {
		this.data = data;
	}

	public Node(Node left, int data, Node right) {
		this.left = left;
		this.data = data;
		this.right = right;
	}
}

class BinaySearchTree {
	Node root;
	int count;
	boolean flag = true;
	public boolean add(int key)
	{
		root=add(root, key);
		return flag;
	}
	public Node add(Node n, int key) {
		if (n == null) {
			n = new Node(key);
			count++;
			return n;
		}
		if (key < n.data)
			n.left = add(n.left, key);
		else if (key > n.data)
			n.right = add(n.right, key);
		else
			flag = false;
		return n;
	}
	public boolean contains(int key)
	{
		return contains(root, key);
	}
	public boolean contains(Node n,int key)
	{
		if(n==null)return false;
		if(key<n.data)return contains(n.left, key);
		else if(key>n.data)return contains(n.right, key);
		else return true;
	}
	public void remove(int key)
	{
		root=remove(root,key);
	}
	public Node remove(Node n,int key)
	{
		if(n==null)return null;
		else if(key<n.data)n.left=remove(n.left,key);
		else if(key>n.data)n.right=remove(n.right, key);
		else
		{
			if(n.left==null)
			{
				count--;
				return n.right;
			}
			else if(n.right==null)
			{
				count--;
				return n.left;
			}
			else
			{
				n.data=minEle(n.right);
				n.right=remove(n.right,n.data);
			}
		}
		return n;
	}
	public int minEle(Node n)
	{
		int min=n.data;
		while(n.left!=null)
		{
			min=n.left.data;
			n=n.left;
		}
		return min;
	}
	public void leveOrder()
	{
		Queue<Node> q=new ArrayDeque<Node>();
		if(root!=null)
		{
			q.add(root);
			while(!q.isEmpty())
			{
				Node n=q.poll();
				System.out.print(n.data+" ");
				if(n.left!=null)q.add(n.left);
				if(n.right!=null)q.add(n.right);
			}
		}
	}
	public int size()
	{
		return count;
	}
}

public class Test {

	public static void main(String[] args) {
		BinaySearchTree b = new BinaySearchTree();
		b.add(50);
		b.add(30);
		b.add(10);
		b.add(35);
		b.add(60);
		b.add(55);
		b.add(70);
		
//		System.out.println(b.contains(90));
		b.leveOrder();
	}
}
