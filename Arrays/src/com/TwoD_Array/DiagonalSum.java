package com.TwoD_Array;

public class DiagonalSum {
	public static void diaSum(int[][] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j || i+j==a.length-1)sum+=a[i][j];
			}
		}
		System.out.println(sum);
	}
	
//	Without using Two for loop
	public static void diaSum1(int[][] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i][i];
			if(i!=a.length-1-i)sum+=a[i][a.length-1-i];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		int[][] a= {{1,2,4},
				    {3,6,5},
				    {7,3,2}};
		diaSum1(a);
		}
	}

