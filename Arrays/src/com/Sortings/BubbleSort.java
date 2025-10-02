package com.Sortings;

import java.util.Arrays;

public class BubbleSort {
	public static void bubble(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,7,9,2,9,0,1};
		bubble(a);
		System.out.println(Arrays.toString(a));
	}

}
