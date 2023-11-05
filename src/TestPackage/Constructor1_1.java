package TestPackage;

public class Constructor1_1 {
	
	Constructor1_1(){
		System.out.println("Hello!");
	}
	Constructor1_1(int n){
		System.out.println("Entered number is : "+n);
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		Constructor1_1 c=new Constructor1_1();
		Constructor1_1 c1=new Constructor1_1(10);
		System.out.println("End");
	}

}
