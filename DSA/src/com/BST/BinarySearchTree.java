package com.BST;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinarySearchTree {
	Node root;
	int count;
	boolean flag = true;

	public boolean add(int key) {
		root = add(root, key);
		return flag;
	}

	public Node add(Node n, int key) {
		if (n == null) {
			n = new Node(key);
			count++;
			return n;
		}
		if (key < n.key)
			n.left = add(n.left, key);
		else if (key > n.key)
			n.right = add(n.right, key);
		else
			flag = false;
		return n;
	}

//	Helper Method
	public boolean contains(int key) {
		return contains(root, key);
	}

	public boolean contains(Node n, int key) {
		if (n == null)
			return false;
		else if (key < n.key)
			return contains(n.left, key);
		else if (key > n.key)
			return contains(n.right, key);
		else
			return true;
	}

	public void preOrder(Node n) {
		if (n == null)
			return;
		System.out.println(n.key);
		preOrder(n.left);
		preOrder(n.right);
	}

	public void preOrder() {
		preOrder(root);
	}

	public void postOrder(Node n) {
		if (n == null)
			return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.println(n.key);
	}

	public void postOrder() {
		postOrder(root);
	}

	public void inOrder(Node n) {
		if (n == null)
			return;
		inOrder(n.left);
		System.out.println(n.key);
		inOrder(n.right);
	}

	public void inOrder() {
		inOrder(root);
	}

	public void levelOrder() {
		Queue<Node> q = new ArrayDeque<Node>();
		if (root != null) {
			q.add(root);
			while (!q.isEmpty()) {
				Node n = q.poll();
				System.out.println(n.key);
				if(n.left!=null)q.add(n.left);
				if(n.right!=null)q.add(n.right);
			}
		}
	}
	public Node remove(Node n,int key)
	{
		if(n==null)return null;
		if(key<n.key)n.left=remove(n.left, key);
		else if(key>n.key)n.right=remove(n.right, key);
		else
		{
			if(n.left==null)
			{
				count--;
				return n.right;
			}
			else if(n.right==null){
				count--;
				return n.left;
			}
			else
			{
				n.key=minElement(n.right);
				n.right=remove(n.right, n.key);
			}
		}
		return n;
	}
	public void remove(int key)
	{
		root=remove(root,key);
	}
	public int minElement(Node n)
	{
		int min=n.key;
		while(n.left!=null)
		{
			min=n.left.key;
			n=n.left;
		}
		return min;
	}
	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return root == null;
	}
}
