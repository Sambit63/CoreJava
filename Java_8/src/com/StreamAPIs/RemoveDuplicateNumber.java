package com.StreamAPIs;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(8,6,5,8,9,0,3,5,1);
		List<Integer> res=l.stream().distinct().sorted().toList();
		System.out.println(res);
	}

}
