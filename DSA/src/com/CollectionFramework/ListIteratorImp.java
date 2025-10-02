package com.CollectionFramework;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
public class ListIteratorImp {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(10,20,30,40,50,60);
		ListIterator<Integer> i=l.listIterator();
		while(i.hasNext())
		System.out.print(i.next()+" "); //10 20 30 40 50 60 
		System.out.println();
		while(i.hasPrevious())
			System.out.print(i.previous()+" "); //60 50 40 30 20 10 
	}
}
