package coreJava;

public class variableInJava {
	static int b =20; //static variable

	public static void main(String[] args) {
		int a=10; // Instance avariable
		add(a,b);
		multiplications(a,b);
		}
	public static void add(int a, int b) {
		int c=30, d; // in this c and d are the local variable
		d=a+b+c;
		System.out.println("Addition of a,b,c is "+d);
		}
	public static void multiplications (int a, int b) {
		int e = 40, f = a*b*e;
		System.out.println("Multiplication of a, b, e is "+f);
		}
}
