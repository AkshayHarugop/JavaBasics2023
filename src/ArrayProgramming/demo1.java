package ArrayProgramming;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size=s.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the numbers");
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("\n==================\n");
		
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		arr[4]=50;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		for(int i:arr) {
			System.out.print(i+",");
		}
		
		System.out.println("\n==============\n");
		
		int a[]= {10,20,30,40,50};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		
	}

}
