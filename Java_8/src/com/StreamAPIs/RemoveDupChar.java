package com.StreamAPIs;

import java.util.stream.Collectors;

public class RemoveDupChar {
public static void main(String[] args) {
	String s="javadev";
	String res=s.chars().distinct().mapToObj(i->String.valueOf((char) i)).collect(Collectors.joining()).toString();
	System.out.println(res);
}
}
