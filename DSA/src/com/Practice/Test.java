package com.Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
	
	public static void reverse()
	{
		int[] a= {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(a));
	}
//	Iterate on A string HaspMap
	public static void iterateHashMap()
	{
		HashMap<String, String> m=new HashMap<>();
		m.put("101", "Alice");
        m.put("102", "Bob");
        m.put("103", "Charlie");
        m.put("104", "David");
        m.put("105", "Emma");
        
        m.forEach((key,value)->System.out.println(key+" "+value));
	}
//	Read Lines from file
	public static void readLines() throws IOException
	{
		int count=0;
		String lastLine="";
		FileReader f=new FileReader("D:\\JSpiders_Java\\JavaProgrammings\\Arrays\\src\\com\\Sortings\\BubbleSort.java");
		BufferedReader bf=new BufferedReader(f);
		String s=bf.readLine();
		while(s!=null)
		{
			count++;
			lastLine=s;
			s=bf.readLine();
		}
		System.out.println(count);
		System.out.println(lastLine);
	}
	public static void printwhenEnter()
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			String input=sc.nextLine();
			System.out.println(input);
		}
	}
	public static void nw(int num,String s)
	{
		
	}
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		String s="Sambit";
		printwhenEnter();
	}
}
