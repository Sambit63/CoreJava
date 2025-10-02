package com.MapFrameWork;

import java.util.HashMap;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(18, "Goat");
		m.put(7, "Thala");
		m.put(45, "HitMan");
		m.put(1, "KL");
		m.put(17, "360");
		m.put(333, "Boss");
		m.put(18, "King");
		
		System.out.println(m);
	}
}
