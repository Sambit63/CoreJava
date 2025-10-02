package com.SortObjects;

public class Mobile {
	String name,color;
	int ram,rom;
	double price;
	public Mobile(String name, String color, int ram, int rom, double price) {
		this.name = name;
		this.color = color;
		this.ram = ram;
		this.rom = rom;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", color=" + color + ", ram=" + ram + ", rom=" + rom + ", price=" + price + "]";
	}	
}
