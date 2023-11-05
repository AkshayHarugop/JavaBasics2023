package TestPackage;

public class ClassTest1_1 {

	int age = 20;
	String name = "Akshay";

	public static void main(String[] args) {
		ClassTest1_1 c = new ClassTest1_1();
		System.out.println(c.age);
		System.out.println(c.name);
		student s = new student();
		System.out.println(s.age);
		System.out.println(s.name);
		System.out.println(s.rNo);
		studentDeatils s1 = new studentDeatils();
		System.out.println(s1.Sage);
		System.out.println(s1.Sname);
		System.out.println(s1.SrNo);
		Method1_1 m = new Method1_1();
		m.MWOARWORE();
		m.MWOARWRT();
		m.MWARWORE(10, 20);
		int multi = m.MWARWRT(10, 20);
		System.out.println(multi);
	}
}