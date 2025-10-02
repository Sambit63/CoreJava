package com.Sortings;

import java.util.Arrays;

public class SelectionSort {
	public static void selection(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[index])
					index = j;
			}
			if (i != index) {
				int temp = a[i];
				a[i] = a[index];
				a[index] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {Integer.MAX_VALUE, 5, 4, 3, 6, 7, -1, 8, 9, 1, 0,Integer.MIN_VALUE };
		selection(a);
		System.out.println(Arrays.toString(a));
	}

}
