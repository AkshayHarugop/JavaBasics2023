package NumberSeries;

import java.util.Scanner;

public class demo3 {
	public static void main(String[] args) {
		System.out.println("2,1,4,3,6,5,8,7,........n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the boundry for n number : ");
		int n = sc.nextInt();
//		int n=10;
		System.out.println();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
					int j=i;
					System.out.print(i+", "+(j-1)+", ");
			}
		}
		
		System.out.println("\n===========");
		System.out.println("2nd logic : ");
		for(int i=1;i<=n;i++) {
			System.out.print((i%2==0)?(i-1)+", ":+(i+1)+", ");
		}
		System.out.println();
		
	}
}


