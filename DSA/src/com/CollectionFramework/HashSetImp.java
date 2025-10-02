package com.CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new HashSet<>();
		s.add("Dosa");
		s.add("Idly");
		s.add("Sambar");
		s.add("Chetny");
		s.add("Chetny");
		System.out.println(s);
		System.out.println(s.size());
	}
}
