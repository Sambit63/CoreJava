package com.Programs;

import java.util.Arrays;

public class ShiftRight_0s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,0,2,0,3,0};
		int pos=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0 )a[pos++]=a[i];
		}
		while(pos<a.length)a[pos++]=0;
		System.out.print(Arrays.toString(a));
	}

}
