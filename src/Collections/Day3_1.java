package Collections;

public class Day3_1 {

	public static void main(String[] args) {
		//For loop
		int[] a = {10,20,30};
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+", ");
		System.out.println("\n===========");
		//for each loop
		for(int i:a)
			System.out.print(i+", ");
		System.out.println("\n===========");
		double[] b= {1.1,1.2,1.3,1.4};
		//for each loop
		for(double i:b)
			System.out.print(i+", ");
	}

}
