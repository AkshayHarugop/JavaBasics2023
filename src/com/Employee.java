package com;

public class Employee extends Testyantra implements Jspider,Qspider {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Testing App!!");
	}

	@Override
	public void develop() {
		// TODO Auto-generated method stub
		System.out.println("Developing App!!");
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.develop();
		e.test();
		e.work();
	}
}
