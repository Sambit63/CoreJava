package com.Programs;

public class SecondMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {-1,0,9,1,2,3,6,7,8,9,8,-1};
		int min1=Integer.MAX_VALUE;
		int min2=min1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min1)
			{
				min2=min1;
				min1=a[i];
			}
			else if(a[i]<min2 && a[i]!=min1)min2=a[i];
		}
		System.out.println(min2);
//		System.out.println(Integer.MIN_VALUE);
	}

}
