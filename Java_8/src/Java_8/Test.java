package Java_8;

import java.util.Arrays;
import java.util.List;

interface inter
{
	int operation(int a,int b);
}
public class Test {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=Arrays.asList(8,3,7,2,9,1,5,12);
		List<Integer> res=l.stream().filter(i->i%2==0).toList();
		System.out.println(res);
	}
}
