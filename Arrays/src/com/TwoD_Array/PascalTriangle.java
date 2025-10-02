package com.TwoD_Array;

import java.util.Scanner;
public class PascalTriangle {
	public static void isPascal(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++)
			{
				if(j==0 || i==j)a[i][j]=1;
				else
					a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of rows:- ");
		int n=new Scanner(System.in).nextInt();
		int sp=n-1;
		int[][]a=new int[n][];
		isPascal(a);
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<=sp;k++)System.out.print(" ");
			for(int j=0;j<a[i].length;j++)System.out.print(a[i][j]+" ");
			System.out.println();
			sp--;
		}		
	}
}
//Enter the number of rows:- 
//5
//     1 
//    1 1 
//   1 2 1 
//  1 3 3 1 
// 1 4 6 4 1 

