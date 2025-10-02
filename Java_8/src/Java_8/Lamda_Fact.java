package Java_8;
@FunctionalInterface
interface I1
{
	int fact(int i);
	
	default void m1(int n)
	{
		I1 i1= a->{
			int fact=1;
			for(int i=1;i<=a;i++)fact*=i;
			
			return fact;
		};
		System.out.println(i1.fact(5));
	}
}

public class Lamda_Fact{
	public static void main(String[] args) {
		
	}
}
