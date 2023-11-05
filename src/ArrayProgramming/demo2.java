package ArrayProgramming;

public class demo2 {
//Q. WAP to copy one array element to another array element..
	/*
	 * ex arr1={10,20,30,40,50}
	 * in arr2={we should add all the elements of arr1}
	 */
	
	public static void main(String[] args) {
		int arr1[]= {10,20,30,40,50,60,7,0,10,20};
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("\n==================\n");
		System.out.println("arr2 elements are : ");
		for(int i:arr2) {
			System.out.print(i+",");
		}
	}

}
