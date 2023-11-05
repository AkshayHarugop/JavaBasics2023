package TestPackage;

public class Static1_1 {
	
	static int age = 20;
	static void study() {
		System.out.println("Student is studing!");
	}
	public static void main(String[] args) {
		System.out.println(Static1_1.age);
		Static1_1.study();
//		System.out.println(Static1_1.study());
		System.out.println("-------------");
		System.out.println(age);
		study();
	}

}
