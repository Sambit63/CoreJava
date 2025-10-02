package com.Sortings;

import java.util.Arrays;
public class Sorting {
//	Bubble Sort
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
	
//	Selection Sort
	public static void selection(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[index])index=j;
			}
			if(i!=index)
			{
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
			}
		}
	}

//	Insertion Sort
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
//	Quick Sort
	public static void quickSort(int[] a,int st,int end)
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
	
//	Merge Sort
	public static void merge(int[] a,int[] b,int[] c)
	{
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])c[k++]=a[i++];
			else c[k++]=b[j++];
		}
		while(i<a.length)c[k++]=a[i++];
		while(j<b.length)c[k++]=b[j++];		
	}
	public static void sort(int[] a)
	{
		if(a.length==1)return;
		int[] left=new int[a.length/2];
		int[] right=new int[a.length-left.length];
		for(int i=0;i<left.length;i++)left[i]=a[i];
		for(int j=0;j<right.length;j++)right[j]=a[left.length+j];		
		sort(left);
		sort(right);
		merge(left,right,a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {9,-1,6,3,5,3,0,2};		
//		quickSort(a,0,a.length-1);
//		sort(a);
//		bubble(a);
//		selection(a);
		insertion(a);
		System.out.println(Arrays.toString(a));
	}
}
