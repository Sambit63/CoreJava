package com.SerializationDeserialization;
import java.io.Serializable;
public class Student implements Serializable{
//	transient String name;
//	static String name
	String name;
	int age;
	int rating;	
	public Student(String name, int age, int rating) {
		this.name = name;
		this.age = age;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rating=" + rating + "]";
	}
	
}
