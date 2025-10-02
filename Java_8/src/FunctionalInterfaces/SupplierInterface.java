package FunctionalInterfaces;

import java.util.function.Supplier;
public class SupplierInterface {
	public static void main(String[] args) {
		Supplier<String> supply=()->"Hello World";
		System.out.println(supply.get());//Hello World
	}
}
