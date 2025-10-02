package FunctionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiInterfaces {
	public static void main(String[] args) {
//		BiPredicate
		BiPredicate<Integer, Integer> isSumEven=(x,y)->(x+y)%2==0;
		System.out.println(isSumEven.test(6, 4));//true
		
//		BiConsumer
		BiConsumer<String,Integer> biConsumer=(x,y)->{
			System.out.println("Name : "+x+" ,Age :"+y);
		};
		biConsumer.accept("Sambit", 23);//Name : Sambit ,Age :23
		
//		BiFunction
		BiFunction<String,String, Integer> biFunction=(s1,s2)->(s1+s2).length();
		System.out.println(biFunction.apply("Sambit", "Sahoo"));//11
	}
}
