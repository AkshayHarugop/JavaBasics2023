package JavaLibraries;

public class Student {
	String name;
	int age;

	@Override
	public String toString() {
		return "Name : " + this.name;

	}

	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
//		Student s1 = new Student("Tom");
//		Student s2 = new Student("Jerry");
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s1.toString());
//		System.out.println(s2.toString());
		System.out.println("********************");
		Student S1 = new Student(21, "Tom");
		Student S2 = new Student(22, "Jerry");
		Student S3 = new Student(23, "Bob");
		Student[] S = new Student[3];
		S[0] = S1;
		S[1] = S2;
		S[2] = S3;
		for (int i = 0; i < S.length; i++) {
			System.out.println(S[i]);
			 System.out.println(S[i].age + " " + S[i].name);
		}
	}
}
