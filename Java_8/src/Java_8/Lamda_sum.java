package Java_8;

interface I3
{
	int sum(int a,int b);
}
public class Lamda_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I3 i=(a,b)->a+b;
		
		System.out.println(i.sum(10, 20));
		System.out.println(i.sum(20, 20));
	}

}
