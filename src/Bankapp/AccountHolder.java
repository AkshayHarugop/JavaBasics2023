package Bankapp;

import Abstraction.ATM;
import Abstraction.Bank;

public class AccountHolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj = new ATM();
		obj.checkbalance();
		obj.deposit(5000);
		obj.checkbalance();
		obj.withdraw(5000);
		obj.checkbalance();
	}

}
