package com.BT;

import java.util.Scanner;
public class BinaryTree {
	static Node root;
	Scanner sc=new Scanner(System.in);
	public void add()
	{
		System.out.println("Enter root element");
		int k=sc.nextInt();
		root=new Node(k);
		add(root, k);
	}
	public void add(Node n,int key)
	{
		System.out.println("Want to insert ele left side of :"+n.key);
		boolean left=sc.nextBoolean();
		if(left)
		{
			n.left=new Node(sc.nextInt());
			add(n.left, key);
		}
		System.out.println("Want to insert ele right side of :"+n.key);
		boolean right=sc.nextBoolean();
		if(right)
		{
			n.right=new Node(sc.nextInt());
			add(n.right,key);
		}
	}
	public void prettyDisplay(Node n,int level)
	{
		if(n==null)return;
		prettyDisplay(n.right, level+1);
		if(level!=0)
		{
			for(int i=0;i<level-1;i++)System.out.print("|\t");
			System.out.println("|----->"+n.key);
		}
		else System.out.println(n.key);
		prettyDisplay(n.left, level+1);
	} 
	public static void main(String[] args) {
		BinaryTree b=new BinaryTree();
		b.add();
		System.out.println("===============================================");
		b.prettyDisplay(root, 0);
	}

}
