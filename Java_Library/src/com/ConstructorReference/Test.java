package com.ConstructorReference;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {

	public static void main(String[] args) {
		LocalDate a=LocalDate.now();
		System.out.println(a);
		
		LocalTime b=LocalTime.now();
		System.out.println(b);
		
		LocalDate d=LocalDate.parse("2024-07-22");
		System.out.println(d.isLeapYear());
	}

}
