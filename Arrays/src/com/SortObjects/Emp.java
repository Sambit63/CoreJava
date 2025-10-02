package com.SortObjects;

public class Emp implements Comparable {
	String name;
	int age,id;
	
	public Emp(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		Emp e=(Emp)o;
//		return this.id-e.id;//Based on ID
//		return this.age-e.age;//Based on Age
		return this.name.compareTo(e.name); //Based on Name
	}
}
