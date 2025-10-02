package com.SortObjects;

import java.util.Arrays;
public class EmpDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp("Ram",28,4);
		Emp e2=new Emp("Sita",25,3);
		Emp e3=new Emp("Bharat",24,1);
		Emp e4=new Emp("Laxman",23,0);
		
		Emp[] e= {e1,e2,e3,e4};
		Arrays.sort(e);
		for(Emp emp:e)System.out.println(emp);
	}
}
