package com.Programs;

import java.util.Arrays;

public class ShiftLeft_0s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,0,2,0,3,0};
		int pos=a.length-1;
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]!=0)a[pos--]=a[i];
		}
		while(pos>=0)a[pos--]=0;
		System.out.println(Arrays.toString(a));
	}
}
