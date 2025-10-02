package Java_8;

public class Emp {
	String name;
	int age;
	long sal;
	public Emp(String name, int age, long sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
}
