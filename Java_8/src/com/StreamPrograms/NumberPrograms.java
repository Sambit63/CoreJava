package com.StreamPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberPrograms {

	public static boolean isPrime(int n)
	{
		if(n<=1)return false;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)return false;
		}
		return true;
	}
	public static void main(String[] args) {
//		P1.Sum of All even numbers
		List<Integer> nums=Arrays.asList(2,5,7,8,10,13);
		Integer sum=nums.stream().filter(x->x%2==0)
				.collect(Collectors.summingInt(x->x));
		System.out.println(sum);//20
		
//		P2.Find The Maximum Number In the Stream
		List<Integer> nums1 = Arrays.asList(12, 56, 3, 89, 45);
		int max=nums1.stream().max(Integer::compare).get();
		System.out.println(max);//89
		
//		P3.Second Highest Number in Stream
		 List<Integer> nums2 = Arrays.asList(5, 12, 9, 21, 17, 21);
		 int secMax=nums2.stream().distinct()
				 .sorted(Comparator.reverseOrder())
				 .skip(1).findFirst().get();
		 System.out.println(secMax);
		 
//		 P4.Find Average of all Numbers
		 List<Integer> nums3 = Arrays.asList(10, 20, 30, 40);
		 double avg=nums3.stream().collect(Collectors.averagingDouble(x->x));
		 System.out.println(avg);
		 
//		 P5.Find Odd numbers and sort them in descending Order
		 List<Integer> nums4 = Arrays.asList(4, 7, 1, 9, 2, 13);
		 List<Integer> res=nums4.stream().filter(x->x%2!=0)
				 .sorted(Comparator.reverseOrder()).toList();
		 System.out.println(res);
		 
//		 P6.Occurence of Each Number
		 List<Integer> nums5=Arrays.asList(12,5,12,8,5,9,5,8,12,14);
		 Map<Integer, Long> freq=nums5.stream()
				 .collect(Collectors.groupingBy(x->x,Collectors.counting()));
		 System.out.println(freq);
		 
//		 P7.Check Prime numbers from the List
		 List<Integer> nums6 = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
		 System.out.println(nums6.stream().filter(x->isPrime(x)).toList());
		 
//		 P8.Find Intersection Of two list
		 List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		 List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
		 System.out.println(list1.stream().filter(list2::contains).toList());
		 
//		 P9.Find The 3rd Highest number
		 int[] arr = {4, 2, 7, 1, 5, 3, 6};
		 int n=3;
		 int nthHigh=Arrays.stream(arr).boxed()
				 .sorted(Comparator.reverseOrder())
				 .skip(n-1).findFirst().orElse(-1);
		 System.out.println(nthHigh);
		 
	}

}
