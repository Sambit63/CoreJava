package com.BST;

public class UserProgram {
	public static void main(String[] args) {
		BinarySearchTree b=new BinarySearchTree();
		b.add(50);
		b.add(30);
		b.add(10);
		b.add(35);
		b.add(60);
		b.add(55);
		b.add(70);
		
		System.out.println(b.size());
		b.levelOrder();
		System.out.println("==============================");
		b.remove(50);
		b.levelOrder();
		System.out.println(b.size());
	}
}
