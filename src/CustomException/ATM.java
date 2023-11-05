package CustomException;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int Balance = 1000;
		System.out.println("Enter the amount to be withdrawn : ");
		int Amount = s.nextInt();
		if(Amount <= Balance) {
			System.out.println("Withdrawal successful!");
		}
		else {
			try {
				InsufficientBalanceException IBE = new InsufficientBalanceException();
				throw IBE;
			}
			catch(InsufficientBalanceException IBE) {
				IBE.printStackTrace();
				System.out.println("Not enough Balance to withdraw! :(");
			}
		}
	}
}