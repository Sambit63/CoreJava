package com.StreamAPIs;

import java.util.Arrays;

public class RemoveDupArrayElement {

	public static void main(String[] args) {
		int[] a= {1,2,3,9,2,7,1,1,2,3};
		int [] b=Arrays.stream(a).distinct().toArray();
		
		System.out.println(Arrays.toString(b));
	}
}
