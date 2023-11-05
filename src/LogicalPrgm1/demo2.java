package LogicalPrgm1;

public class demo2 {
	public static void main(String[] args) {
//swap 2 numbers
		int a = 10, b = 20;
		int c;
		System.out.println("Before swaping value of a :" + a + " & b :" + b);
		c = a;
		a = b;
		b = c;
		System.out.println("After swaping value of a :" + a + " & b :" + b);
//		System.out.println("value of a is : "+a);
//		System.out.println("value of b is : "+b);
		System.out.println("==============");

//2nd logic
		a = 10;
		b = 20;
		System.out.println("Before swaping value of a :" + a + " & b :" + b);
		a = a + b; // a=30
		b = a - b; // b=10
		a = a - b; // a=20
		System.out.println("Before swaping value of a :" + a + " & b :" + b);
		System.out.println("==============");
		
//3rd logic
		a = 10;
		b = 20;
		System.out.println("Before swaping value of a :" + a + " & b :" + b);
		a=a*b; //a=200
		b=a/b; //b=200/20=10
		a=a/b; //a=200/10=20
		System.out.println("Before swaping value of a :" + a + " & b :" + b);
		System.out.println("==============");
		
//4th logic	: with XOR operator
		a = 10;
		b = 20;
		System.out.println("Before swaping value of a :" + a + " & b :" + b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Before swaping value of a :" + a + " & b :" + b);
		System.out.println("==============");
		
//5th logic	: in a single line 
		a = 10;
		b = 20;
		System.out.println("Before swaping value of a :" + a + " & b :" + b);
		b=(a+b)-(a=b);
		System.out.println("Before swaping value of a :" + a + " & b :" + b);
	}
}
