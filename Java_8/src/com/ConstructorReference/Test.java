package com.ConstructorReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Student
{
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
	@Override
	public String toString() {
		return "Student [name=" + name+"]";
	}	
	
}
public class Test {
	public static void main(String[] args) {
//		Ex-1 Using Lamda Expression
		Supplier<Student> s1=()->new Student("Ram",28);
		Student s=s1.get();
		System.out.println(s.name+" "+s.age);//Ram 28
		
//		Ex-2 Using Constructor Reference
		Supplier<Student> s2=Student::new;
		Student s3=s2.get();
		System.out.println(s3.name+" "+s3.age);//null 0
		
//		Ex-3 Using Constructor reference
		List<String> names=Arrays.asList("Sambit","Anil","Amit");
		List<Student> studentList=names.stream().map(Student::new).collect(Collectors.toList());
		studentList.forEach(System.out::println);
//				Student [name=Sambit]
//				Student [name=Anil]
//				Student [name=Amit]

	}
}
