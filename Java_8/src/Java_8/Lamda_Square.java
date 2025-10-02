package Java_8;
@FunctionalInterface
interface I2
{
	int sq(int a);
}
public class Lamda_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I2 i1=a->a*a;
		
		System.out.println(i1.sq(25));
	}

}
