package com.TwoD_Array;

import java.util.Scanner;

public class UpDownMatrix {
	public static void updown(int[][] a)
	{
		int num=1;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<a.length;j++)a[j][i]=num++;
			}
			else
			{
				for(int j=a.length-1;j>=0;j--)a[j][i]=num++;
			}
		}
	}
//	5
//	1	10	11	20	21	
//	2	9	12	19	22	
//	3	8	13	18	23	
//	4	7	14	17	24	
//	5	6	15	16	25
	public static void rightLeft(int[][] a)
	{
		int num=1;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<a.length;j++)a[i][j]=num++;
			}
			else
			{
				for(int j=a.length-1;j>=0;j--)a[i][j]=num++;
			}
		}
	}
//	5
//	1	2	3	4	5	
//	10	9	8	7	6	
//	11	12	13	14	15	
//	20	19	18	17	16	
//	21	22	23	24	25
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=new Scanner(System.in).nextInt();
		int a [][]=new int[n][n];
		updown(a);
//		rightLeft(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)System.out.print(a[i][j]+"\t");
			System.out.println();
		}
		
	}

}
