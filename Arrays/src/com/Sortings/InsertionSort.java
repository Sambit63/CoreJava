 package com.Sortings;

import java.util.Arrays;

public class InsertionSort {
	public static void insertion(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,4,3,7,8,9,0,1,2};
		insertion(a);
		System.out.println(Arrays.toString(a));
	}

}
