package TestPackage;

public class Blocks1_1 {
	static {
		System.out.println("In static Block-1");
	}
	static {
		System.out.println("In static block-2");
	}
	
	{
		System.out.println("In block-3");
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		Blocks1_1 b = new Blocks1_1();
		System.out.println("End");
	}
	static {
		System.out.println("In static block-4");
	}
}
