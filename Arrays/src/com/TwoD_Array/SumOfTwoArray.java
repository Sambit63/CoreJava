package com.TwoD_Array;

import java.util.Arrays;

public class SumOfTwoArray {
	public static void sum(int a[][],int b[][])
	{
		int[][] res=new int[a.length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				res[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int[] n:res)
		{
			System.out.println(Arrays.toString(n));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,1},{1,1,1},{1,0,1}};
		int [][]b= {{1,0,1},{1,2,1},{1,1,1}};
		sum(a,b);
		
	}

}
