package JavaLibraries;

public class Student1 {

	private int age;

	public Student1(int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		Student1 s = (Student1) obj;
		return this.age == s.age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1(20);
		Student1 s2 = new Student1(20);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

	}

}
