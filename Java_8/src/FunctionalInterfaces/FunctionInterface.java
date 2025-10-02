package FunctionalInterfaces;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ex-1
		Function<Integer, Integer>square=a->a*a;
		Function<Integer, Integer> sqroot=a->(int)Math.sqrt(a);		
		System.out.println(square.apply(12)); //144
		System.out.println(sqroot.apply(16));//4
		
//		Ex-2
		Function<Integer, Integer>doubleIt=x->x*2;
		Function<Integer, Integer>tripleIt=x->x*3;
		System.out.println(doubleIt.andThen(square).apply(5));//100
		System.out.println(square.compose(tripleIt).apply(2));//36		
		
//		Ex-3
		Function<Integer, Integer> identity=Function.identity();
		System.out.println(identity.apply(5));//5
		
//		
	}
}
