package com.TwoD_Array;

import java.util.Arrays;
public class MatrixMultiplication {
	public static void mul(int[][] a,int[][] b)
	{
		int res[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					res[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(int n[]:res)System.out.println(Arrays.toString(n));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,1},
				    {1,1,1},
				    {3,3,1}};
		int[][] b= {{2,2,1},
				    {3,3,1},
				    {1,1,2}};		
		mul(a,b);
		}
}

