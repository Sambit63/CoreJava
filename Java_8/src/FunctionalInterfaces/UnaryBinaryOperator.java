package FunctionalInterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperator {
	public static void main(String[] args) {
//		UnaryOperator
		UnaryOperator<Integer> toDouble= x->x*2;
		System.out.println(toDouble.apply(6));//12
		
//		BinaryOperator
		BinaryOperator<Integer> sum=(x,y)->x+y;
		System.out.println(sum.apply(30, 40));//70
	}
}
