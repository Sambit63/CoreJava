package com.Sortings;

import java.util.Arrays;

public class MergeSort {
	public static void merge(int a[], int[] b, int c[]) {
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j])
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}
//		This two line is going to add the extra element after the upper while becomes false;
		while (i < a.length)
			c[k++] = a[i++];
		while (j < b.length)
			c[k++] = b[j++];
	}
	
//	Divide and Merge Operation3
	public static void sort(int a[]) {
		if (a.length == 1)
			return;
		int left[] = new int[a.length / 2];
		int right[] = new int[a.length - left.length];
		for (int i = 0; i < left.length; i++)
			left[i] = a[i];
		for (int j = 0; j < right.length; j++)
			right[j] = a[left.length + j];
		sort(left);
		sort(right);
		merge(left, right, a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4, 5, 6, 7, 2, 6, 9, 0, 1 };
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
