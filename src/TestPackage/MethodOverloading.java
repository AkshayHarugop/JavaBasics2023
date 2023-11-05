package TestPackage;

public class MethodOverloading {

	void M1() {
		System.out.println("Method Overloading 1");
	}

	void M1(int n) {
		System.out.println("Method Overloading 2 "+n);
	}

	void M1(int n, String name) {
		System.out.println("Method Overloading 3 "+n+" and "+name);
	}
	
	void checkTheNumberisPositiveorNegative(int n){
		if(n>0) {
			System.out.println("The given number "+n+" is positive number");
		}
		else if(n<0) {
			System.out.println("The given number "+n+" is negative number");
		}
		else {
			System.out.println("The given number "+n+" is zero");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Start");
		MethodOverloading MO= new MethodOverloading();
		MO.M1();
		MO.M1(10);
		MO.M1(20, "Akshay");
		System.out.println("End");
	}
}
