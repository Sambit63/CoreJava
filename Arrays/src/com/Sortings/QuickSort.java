package com.Sortings;

import java.util.Arrays;

public class QuickSort {
	public static void quickSort(int[]a,int st,int end)
	{
		if(st>end)return;
		int i=st,j=end;
		int pivot=(i+j)/2;
		if(i<j)
		{
			while(a[i]<a[pivot])i++;
			while(a[j]>a[pivot])j--;
		}
		if(i<=j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		quickSort(a,st,j);
		quickSort(a,i,end);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,3,2,1,-1,0,2};
		quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

}
