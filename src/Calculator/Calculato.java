package Calculator;

import java.util.Scanner;

public class Calculato {

	public static void main(String[] args) {
		System.out.println("Welcome to Calculator :)");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = s.nextInt();
		System.out.print("Enter the second number : ");
		int b = s.nextInt();
		System.out.println("Select any one operator from below : ");
		System.out.println("1. Addition/n2. Subtraction/n3. Multiplication/n4. Division/n5. Exit");
		int choice = s.nextInt();
		MathematicalOperations MO = new CalculatorImpl();
		switch(choice) {
		case 1:
			System.out.println(MO.add(a, b));
			break;
		case 2:
			System.out.println(MO.sub(a, b));
			break;
		case 3:
			System.out.println(MO.mul(a, b));
			break;
		case 4:
			System.out.println(MO.div(a, b));
			break;
		case 5:
			System.out.println("Thank you :)");
			System.exit(0);
		
		default : 
			System.out.println("Invalid Choice!!");
			System.exit(0);
		}
		
		s.close();
	}

}
