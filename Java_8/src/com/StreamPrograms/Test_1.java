package com.StreamPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " - " + salary;
    }
}
public class Test_1 {

	public static void main(String[] args) {
//		1. Find Even Numbers from a List
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6);
		List<Integer> even=nums.stream().filter(x->x%2==0).toList();
		System.out.println(even);
		
//		2. Find the Longest String in a List
		List<String> words=Arrays.asList("apple", "banana", "grape", "watermelon");
		System.out.println(
				words.stream()
				.max((a,b)->Integer.compare(a.length(),b.length())).get());//watermelon
		
//		3. Count Words Starting with a Specific Letter "A"
		List<String> names = Arrays.asList("Anil", "Sunil", "Amit", "Raj", "Ajay");
		System.out.println(
				names.stream()
				.filter(x->x.startsWith("A")).count());//3
		
//		4. Sort a List of Employees by Salary (Descending)
		List<Employee> emp = Arrays.asList(
	            new Employee("John", 50000),
	            new Employee("Alice", 75000),
	            new Employee("Bob", 60000)
	        );
		
		emp.stream().sorted((e1,e2)->Double.compare(e2.salary, e1.salary)).forEach(System.out::println);
//		Alice - 75000.0
//		Bob - 60000.0
//		John - 50000.0

//		5. Find the Sum of All Squares of Numbers Greater than 5
		List<Integer> num = Arrays.asList(3, 6, 8, 2, 7);
	    int sum=num.stream().filter(x->x>5).map(x->x*x).reduce(0,Integer::sum);
	    System.out.println(sum);
	    
//	    6. Group Words by Their First Letter
	    List<String> word = Arrays.asList("apple", "banana", "apricot", "blueberry", "cherry", "avocado");
	    System.out.println(
	    		word.stream()
	    		 .collect(Collectors.groupingBy(x->x.charAt(0))));

//	    7. Find the Distinct Elements
	    List<Integer> nums1=Arrays.asList(1, 2, 2, 3, 4, 4, 5);
	    nums1.stream().distinct()
	    .forEach(x->System.out.print(x+" "));
	    
//	    8. Find the Second Highest Number
	    List<Integer> nums2=Arrays.asList(10, 20, 35, 50, 50, 40);
	    int secHigh=nums2.stream().distinct()
	    		.sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	    System.out.println(secHigh);
	    
//	    10. Count the Frequency of Each Character
	    String str="banana";
	    Map<Object, Long> freq=str.chars().mapToObj(x->(char)x)
	    		.collect(Collectors.groupingBy(x->x,Collectors.counting()));
	    System.out.println(freq);//{a=3, b=1, n=2}
	    
//	    11.Frequency of each word in a sentence
	    String str1="java is very easy java is";
	    Map<String, Long> freq1=Arrays.stream(str1.split(" "))
	    		.collect(Collectors.groupingBy(x->x,Collectors.counting()));
	    System.out.println(freq1);
	    //{very=1, java=2, is=2, easy=1}
	    
//	    12. Remove Duplicate Character
	    String s="javadev";
		String res=s.chars().distinct().mapToObj(i->String.valueOf((char) i)).collect(Collectors.joining()).toString();
		System.out.println(res);
		
//		13.Remove Duplicate Word
		String s1="java is very very easy java :)";
		String res1=Arrays.stream(s1.split(" ")).distinct().collect(Collectors.joining(" "));
		System.out.println(res1);
		
		
//	    14. Find Palindrome Strings from a List
	    List<String> words1 = Arrays.asList("level", "world", "radar", "java", "madam");
	    words1.stream()
	    .filter(w->new StringBuilder(w).reverse().toString().equals(w))
	    .forEach(w->System.out.print(w+" "));//level radar madam 
	    

	    
	}
}
