package com.Searchings;

public class Searchings {
	public static int linear(int[] a,int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)return i;
		}
		return -1;
	}
	public static int binary1(int[] a,int key)
	{
		int st=0,end=a.length-1;
		while(st<=end)
		{
			int mid=(st+end)/2;
			if(key==a[mid])return mid;
			else if(key<a[mid])end=mid-1;
			else st=mid+1;
		}
		return -1;
	}
	public static int binary(int[] a,int st,int end,int key)
	{
		if(st>end)return -1;
		int mid=(st+end)/2;
		if(key==a[mid])return mid;
		else if(key<a[mid])return binary(a,st,mid-1,key);
		else return binary(a,mid+1,end,key);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-2,-1,0,1,2,3,4,5,6};//Sorted array
		int b[]= {9,2,-1,4,8,3,-4,5};
		System.out.println(linear(b,-1));
//		System.out.println(binary1(a,6));
		System.out.println(binary(a,0,a.length-1,1));
	}
}
