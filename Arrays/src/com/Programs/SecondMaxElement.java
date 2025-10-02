package com.Programs;

public class SecondMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {-1,0,9,1,2,3,6,7,8,9,8,-1};
		int max1=Integer.MIN_VALUE;
		int max2=max1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2 && a[i]!=max1)max2=a[i];
		}
		System.out.println(max2);
	}
}
