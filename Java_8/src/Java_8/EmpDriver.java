package Java_8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmpDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp("Sravani",19,20000);
		Emp e2=new Emp("Vennela",23,40000);
		Emp e3=new Emp("Jyo",20,50000);
		Emp e4=new Emp("Ram",28,80000);
		Emp e5=new Emp("Ayvak",24,80000);
		Emp e6=new Emp("Banrakas",40,60000);
		
		Emp[] e= {e1,e2,e3,e4,e5,e6};
		
		Predicate<Emp> p =i->i.sal<=50000;
		Predicate<Long> p1=i->i>3000;
		
		Consumer<Emp> cs=i->System.out.println(i.name+"\t"+i.sal);
		
		Function<Emp, Long> f=i->
		{
			if(p.test(i))
			{
				long bonus=i.sal*10/100;
				return bonus;
			}
			else
			{
				long bonus=i.sal*5/100;
				return bonus;
			}
		};
		for(Emp n:e)
		{
			long b=f.apply(n);
			if(p1.test(b))
			{
				cs.accept(n);
				System.out.println("Bonus= "+b+"\n");
			}
		}
	}

}
