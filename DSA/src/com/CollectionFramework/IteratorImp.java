package com.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorImp {

	public static void main(String[] args) {
		Set<String> s=new HashSet<>();
		s.add("Vardha");
		s.add("Deva");
		s.add("Shouryanga");
		s.add("KhanSaar");
		s.add("Pandit");
		s.add("Vishnu");
		Iterator<String> i= s.iterator();
		while(i.hasNext())
		{
			String str=i.next();
			if(str.equals("Vishnu"))i.remove();
		}
		System.out.println(s);
	}
}
//[KhanSaar, Vardha, Deva, Pandit, Shouryanga]