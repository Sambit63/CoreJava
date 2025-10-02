package com.BT;
public class Node {
	Node left;
	int key;
	Node right;
	public Node(int key)
	{
		this.key=key;
	}
	public Node(Node left, int key, Node right) {
		this.left = left;
		this.key = key;
		this.right = right;
	}	
}
