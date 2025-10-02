package com.SortObjects;

import java.util.Comparator;
public class SortByMobName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Mobile m1=(Mobile)o1;
		Mobile m2=(Mobile)o2;
		return m1.name.compareTo(m2.name);
	}
}
 class SortByColor implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Mobile m1=(Mobile)o1;
		Mobile m2=(Mobile)o2;
		return m1.color.compareTo(m2.color);
	}
}

 class SortByRam implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			Mobile m1=(Mobile)o1;
			Mobile m2=(Mobile)o2;
			return m1.ram-m2.ram;
		}
	}
 class SortByRom implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			Mobile m1=(Mobile)o1;
			Mobile m2=(Mobile)o2;
			return m1.rom-m2.rom;
		}
	}
 class SortByPrice implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			Mobile m1=(Mobile)o1;
			Mobile m2=(Mobile)o2;
			return (int)(m1.price-m2.price);
		}
	}
