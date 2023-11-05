package coreJava;

public class variablesInJava2 {
	int a=10; //instance variable
	static int b = 20; //static variable
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variablesInJava2 ab1 =new variablesInJava2();
		System.out.println(ab1.a);
		System.out.println(ab1.b);
		ab1.a=1000;
		ab1.b=2000;
		System.out.println(ab1.a);
		System.out.println(ab1.b);
		variablesInJava2 ab2 =new variablesInJava2();
		System.out.println(ab2.a);
		System.out.println(ab2.b);
	}
}
