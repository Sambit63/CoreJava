package com.SortObjects;

import java.util.Arrays;
import java.util.Scanner;
public class MobileDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean r=true;
		Mobile m1=new Mobile("Oppo","Black",4,64,10000);
		Mobile m2=new Mobile("IQOO","SkyBlue",8,128,30000);
		Mobile m3=new Mobile("Xiaomi","White",6,256,20000);
		Mobile m4=new Mobile("Samsung","Black",10,200,40000);
		Mobile m5=new Mobile("Apple","Golden",12,512,150000);
		Mobile m6=new Mobile("Nothing","Navy",5,120,50000);
		
		Mobile[] m= {m1,m2,m3,m4,m5};
		System.out.println(m1+"\n"+m2+"\n"+m3+"\n"+m4+"\n"+m5+"\n"+m6);
		do
		{
			System.out.println("Sort By:-");
			System.out.println("1.Name\n2.Price\n3.RAM\n4.ROM\n5.Color\n6.Exit");
			int n=new Scanner(System.in).nextInt();
			switch(n)
			{
			case 1:
			{
				Arrays.sort(m,new SortByMobName());
				for(Mobile mob:m)System.out.println(mob);
			}break;
			case 2:
			{
				Arrays.sort(m,new SortByPrice());
				for(Mobile mob:m)System.out.println(mob);
			}break;
			case 3:
			{
				Arrays.sort(m,new SortByRam());
				for(Mobile mob:m)System.out.println(mob);
			}break;
			case 4:
			{
				Arrays.sort(m,new SortByRom());
				for(Mobile mob:m)System.out.println(mob);
			}break;
			case 5:
			{
				Arrays.sort(m,new SortByColor());
				for(Mobile mob:m)System.out.println(mob);
			}break;
			case 6:
			{
				r=false;
				System.out.println("Thank You Visit Again");
			}break;
			default:
			{
				System.out.println("Invalid");
			}
			}
		}while(r);
	}
}
