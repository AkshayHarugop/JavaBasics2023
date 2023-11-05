package com;

public class Calci extends Calculator {
	int result;

	@Override
	int Add(int a, int b) {
		System.out.print("Addition of " + a + " and " + b + " is ");
		result = a + b;
		System.out.println(result);
		return result;
	}

	@Override
	int Substract(int a, int b) {
		System.out.println("Substract of " + a + " and " + b + " is ");
		result = a - b;
		System.out.println(result);
		return result;
	}

	@Override
	int Multiply(int a, int b) {
		System.out.println("Multiplication of " + a + " and " + b + " is ");
		result = a * b;
		System.out.println(result);
		return result;
	}

	@Override
	int Devide(int a, int b) {
		System.out.println("Devision of " + a + " and " + b + " is ");
		result = a / b;
		System.out.println(result);
		return result;
	}

}
