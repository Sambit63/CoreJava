package com.Searchings;

public class LinearSearch {
	public static int linear(int[]a,int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,7,1,0,4,8};
		System.out.println(linear(a,0));
	}

}
