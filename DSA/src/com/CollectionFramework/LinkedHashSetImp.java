package com.CollectionFramework;
import java.util.*;
public class LinkedHashSetImp {

	public static void main(String[] args) {
		LinkedHashSet<Integer> l=new LinkedHashSet<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		for(Integer n:l)System.out.print(n+" ");
	}
}
