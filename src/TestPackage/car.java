package TestPackage;

public class car {
	
	car(String brand){
		this(500);
		System.out.println(brand);
	}
	car(int cost){
//		this("bmw");
		System.out.println(cost);
	}

	public static void main(String[] args) {
		//RecursiveChainingConstructor
		car c = new car("bmw");

	}

}
