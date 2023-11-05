package TestPackage;

public class Method1_1 {
	void MWOARWORE(){
		System.out.println("Method without argument & without return type");
	}
	
	void MWARWORE(int a, int b){
		System.out.println("Method with argument & without return type");
		int sum = a+b;
		System.out.println("Sum of "+a+" & "+b+" is equal to "+sum);
		}
	
	int MWOARWRT(){
		System.out.println("Method without argument & with return type");
		return 10;
	}
	
	int MWARWRT(int a, int b){
		System.out.println("Method with argument & with return type");
		return a*b;
	}
	
	public static void main(String[] args) {
		Method1_1 m=new Method1_1();
		m.MWOARWORE();
		m.MWOARWRT();
		m.MWARWORE(10, 20);
		int multi = m.MWARWRT(10, 20);
		System.out.println(multi);
		
		MethodOverloading MO= new MethodOverloading();
		MO.M1();
		MO.M1(10);
		MO.M1(20, "Akshay");
		
	}

}
