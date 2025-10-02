package com.ParallelStreams;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
	public static long fact(int n)
	{
		if(n==0)return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		List<Integer> list=Stream.iterate(1, x->x+1).limit(1000).toList();
		List<Long> factorial=list.stream().map(ParallelStream::fact).toList();
		long endTime=System.currentTimeMillis();
		System.out.println("Time taken with sequential stream "+(endTime-startTime+" ms"));
		//Time taken with sequential stream 41 ms
		
		startTime=System.currentTimeMillis();
	    factorial=list.parallelStream().map(ParallelStream::fact).toList();
	    endTime=System.currentTimeMillis();
	    System.out.println("Time taken with parallel stream "+(endTime-startTime+" ms"));
//	    Time taken with parallel stream 17 ms
	}
}
