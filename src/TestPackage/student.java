package TestPackage;

public class student {

	int age = 29;
	String name = "Ajay";
	int rNo = 21;
	
	public static void main(String[] args) {
		student s = new student();
		System.out.println(s.age);
		System.out.println(s.name);
		System.out.println(s.rNo);
		System.out.println("---------------");
		System.out.println("My student name is "+s.name);
		System.out.println("My student roll number is "+s.rNo);
		System.out.println("My student age is "+s.age);
		System.out.println("---------------");
		studentDeatils sd = new studentDeatils();
		System.out.println("My student name is "+sd.Sname);
		System.out.println("My student roll number is "+sd.SrNo);
		System.out.println("My student age is "+sd.Sage);
		
	}
}
