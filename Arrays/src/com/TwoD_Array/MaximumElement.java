package com.TwoD_Array;

public class MaximumElement {
	public static void maxElement(int a[][])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)max=a[i][j];
			}
		}
		System.out.println("The maximum Element is: "+max);
	}
	public static void minElement(int a[][])
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]<min)min=a[i][j];
			}
		}
		System.out.println("The minimum Element is: "+min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{-1,-1,-5,-7,-8},
			        {-5,-2,-8,-3,-7},
			        {-9,-5,-9,-1,-4}};
		minElement(a);	
		}
}
