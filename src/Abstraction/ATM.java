package Abstraction;

public class ATM implements Bank {
	int balance = 10000;

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Depositing Rs : " + amount);
		balance = balance + amount;
		System.out.println("Amount deposit successfully");
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Withdrawing Rs : " + amount);
		balance = balance - amount;

	}

	@Override
	public void checkbalance() {
		// TODO Auto-generated method stub
		System.out.println("Available balance is : "+balance);
	}

}
