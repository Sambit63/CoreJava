package com.Programs;

public class MaximumEl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {-1,-3,-4,-3,-1};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)max=a[i];
		}
		System.out.println(max);
	}

}
