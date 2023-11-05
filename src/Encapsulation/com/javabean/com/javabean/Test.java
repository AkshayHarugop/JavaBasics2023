package Encapsulation.com.javabean.com.javabean;

public class Test {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(20);
		int age = p.getAge();
		System.out.println(age);
		System.out.println(p.getAge());
	}

}
