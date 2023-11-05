package TestPackage;

public class detailsCalling {

	public static void main(String[] args) {
		studentDeatils s = new studentDeatils();
		System.out.println("My student name is "+s.Sname);
		System.out.println("My student roll number is "+s.SrNo);
		System.out.println("My student age is "+s.Sage);
		s.Sage=30;
		s.Sname="Akshay";
		s.SrNo=26;
		System.out.println("My student name is "+s.Sname);
		System.out.println("My student roll number is "+s.SrNo);
		System.out.println("My student age is "+s.Sage);

	}

}
