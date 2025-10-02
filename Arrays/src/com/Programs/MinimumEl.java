package com.Programs;

public class MinimumEl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {-1,0,9,1,2,3,6,7,8,9,8,-1};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)min=a[i];
		}
		System.out.println(min);
	}
}
