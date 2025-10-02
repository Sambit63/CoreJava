package com.TwoD_Array;

import java.util.Arrays;

public class Sort2DArray {
	public static void sort(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					for(int l=0;l<a.length;l++)
					{
						if(a[i][j]<a[k][l])
						{
							int temp=a[i][j];
							a[i][j]=a[k][l];
							a[k][l]=temp;
						}
					}
				}
			}
		}
		for(int[] n:a)
		{
			System.out.println(Arrays.toString(n));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{9,8,7},
				    {6,5,4},
				    {3,2,1},
				    };
		sort(a);
	}

}
