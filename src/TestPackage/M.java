package TestPackage;

public class M {
	
	//Method without argument and without return type
	void M1(){
		System.out.println("Hello World !!");
	}
	
	//Method with argument and without return type
	void M2(String Name, int Age){
		System.out.println("My name is "+Name+" and my age is "+Age);
	}
	
	//Method without argument and with return type
	int M3(){
		return 10;
	}
	
	//Method with argument and with return type
	int M4(int num1, int num2){
		int sum=num1+num2;
		return sum;
	}
}
