package com.ConstructorReference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class Student {
	String name;
	int age;

	public Student() {

	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student(String name) {
		this.name = name;
	}

}

public class Demo {

	public static void main(String[] args) {
		Supplier<Student> s1=()->new Student("Ram",28);
		Supplier<Student> s2=Student::new;
		
		Student s=s1.get();
		System.out.println(s.name+" "+s.age);
		Student s3=s2.get();
		System.out.println(s3.name+" "+s3.age);
		
		Function<String, Student> f=Student::new;
		Student s4=f.apply("Nitish");
		System.out.println(s4.name+" "+s4.age);
		
		BiFunction<String, Integer, Student> b=Student::new;
		Student s5=b.apply("Sambit", 23);
		System.out.println(s5.name+" "+s5.age);
	}
}
