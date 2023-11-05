package JavaControlStatements.LoopStatements;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 0;
		while (5 >= i) {
			System.out.print(i + ", ");
			i++;
		}

		System.out.println("\n============");
		System.out.println("Printing the list of first 10 even numbers");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the range root node : ");
		int j = s.nextInt();
		System.out.print("Enter the range end node : ");
		int k = s.nextInt();
		int l;
		if (j % 2 == 0) {
			l = j;
		} else {
			l = j + 1;
		}

		while (l <= k) {
			System.out.print(l+", ");
			l += 2;
		}
		s.close();

	}

}
