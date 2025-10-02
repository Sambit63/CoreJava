package com.MapFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
 public class HashMapIMp {

	public static void main(String[] args) {
		Map<String, Integer> m=new HashMap<>();
		m.put("CSK", 5);
		m.put("SRH", 1);
		m.put("MI", 5);
		m.put("KKR", 3);
		m.put("PBKS", 0);
		m.put("GT",1);
		m.put("RCB", 1);
		
		Set<String> s=m.keySet();
		Iterator<String> i=s.iterator();
		while(i.hasNext())
		{
			String key=i.next();
			int value=m.get(key);
			System.out.println(key+" = "+value);
		}
	}

}
