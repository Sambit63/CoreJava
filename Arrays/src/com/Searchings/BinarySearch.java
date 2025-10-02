package com.Searchings;

public class BinarySearch {
//	Without Recurssion
	public static int binary1(int[]a,int key)
	{
		int st=0;
		int end=a.length-1;
		while(st<=end)
		{
			int mid=(st+end)/2;
			if(key==a[mid])return mid;
			else if(key<a[mid])end=mid-1;
			else st=mid+1;
		}
		return -1;
	}
	
//	With Recurssion
	public static int binary(int[]a,int key,int st,int end)
	{
		if(st>end)return -1;
		int mid=(st+end)/2;
		if(key==a[mid])return mid;
		else if(key<a[mid])return binary(a,key,st,mid-1);
		else return binary(a,key,mid+1,end);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,5,7,8,9,12};
		System.out.println(binary(a,3,0,a.length-1));
	}

}
