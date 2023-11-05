package NumberSeries;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		//2,4,6,8,10,12,.........n
		System.out.println("Welcome to Java console for n even numbers :)\n2,4,6,8,10,12,.........n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		int count =0;
		for(int i=1;i<=n*2;i++) {
			if(i%2==0) {
				System.out.print(i+", ");
				count++;
			}
		}
		System.out.println("\nCount is : "+count);
		
		System.out.println("===========");
		System.out.println("\n2nd logic");
		int count1 =0;
		for(int i=2;i<=n*2;i+=2) {
				System.out.print(i+", ");
				count1++;
		}
		System.out.println("\nCount is : "+count1);
		
		
		System.out.println("===========");
		System.out.println("\n3rd logic");
		int count2 =0;
		for(int i=2;i<=n*2;i+=4) {
				System.out.print(i+", "+(i+2)+", ");
				count2++;
		}
		System.out.println("\nCount is : "+count2);
		
		
		
	}

}
