package com;

public class AccountHolder implements HDFCBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountHolder ah =new AccountHolder();
		ah.deposit();
		ah.withdraw();
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposited");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw");
	}

}
