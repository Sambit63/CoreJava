package com.TwoD_Array;

import java.util.Arrays;

public class TransposeMatrix {
	public static void trans(int[][] a)
	{
		int[][]b= new int [a.length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		for(int[] n:b)System.out.println(Arrays.toString(n));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		trans(a);
	}

}
