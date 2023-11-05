package Bankapp;

import java.util.Scanner;

import Abstraction.ATM;
import Abstraction.Bank;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to ATM");
		System.out.println("**************");
		Scanner s = new Scanner(System.in);
		Bank obj = new ATM();
		while(true) {
			System.out.println("1.Deposit\n2.Withdraw\n3.CheckBalance\n4.exit");
			System.out.print("Enter the choice : ");
			int choice = s.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter the amount to be deposited : ");
				int dAmt = s.nextInt();
				obj.deposit(dAmt);
				break;
			case 2:
				System.out.print("Enter the amount to be withdrawn : ");
				int wAmt= s.nextInt();
				obj.withdraw(wAmt);
				break;
			case 3:
				obj.checkbalance();
				break;
			case 4:
				System.out.println("Thank you!");
				System.exit(0);
				break;
			default :
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Thank you for using ATM!!");
		}
	}

}
