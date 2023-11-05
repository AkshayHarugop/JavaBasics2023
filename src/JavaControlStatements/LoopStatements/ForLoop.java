package JavaControlStatements.LoopStatements;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ", ");
		}
		System.out.println("\n=============");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range root node : ");
		int a = s.nextInt();
		System.out.println("Enter the range end node : ");
		int b = s.nextInt();
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of natural numbers is : " + sum);
		s.close();
	}
}
