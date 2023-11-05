package CustomException;

import java.util.Scanner;

public class MetrimonyPortal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int Age = s.nextInt();
		if(Age>=21) {
			System.out.println("Get married soon!");
		}
		else {
			try {
				AgeInvalidException AIE = new AgeInvalidException("Have Patience!");
				throw AIE;
			}
			catch(AgeInvalidException AIE){
				AIE.printStackTrace();
				System.out.println(AIE.getMessage());
			}
			finally {
				System.out.println("Thank you !");
			}
		}
	}

}
