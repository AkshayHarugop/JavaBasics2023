package TestPackage;

import java.util.Scanner;

class ScannerClass {

	public static void main(String[] args) {
		/*System.out.println("Start");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Name of the Employee : ");
		String name = scan.next().toUpperCase();
//		String name1 = scan.nextLine();
		System.out.println("Enter the employee id : ");
		int id = scan.nextInt();
		System.out.println("Current salary : ");
		int salary = scan.nextInt();
		scan.close();
		
		System.out.println("Employee name is : "+name+" his identity number is : "+id+" and in hand salary is : "+salary);*/
		System.out.println("End");
		
		String sampleText = "Programmers love Java!\n"
							+"User input with java is so easy!\n"
							+"Just use the scanner class.\n";
		Scanner s = new Scanner(sampleText);
		/*System.out.println("1st class : " + s.next());
		System.out.println("2nd class : " + s.next());
		System.out.println("3rd class : " + s.next());
		System.out.println("4th class : " + s.next());*/
		
		
		System.out.println("1st class : " + s.nextLine());
		System.out.println("2nd class : " + s.nextLine());
		System.out.println("3rd class : " + s.nextLine());
		
	}

}
