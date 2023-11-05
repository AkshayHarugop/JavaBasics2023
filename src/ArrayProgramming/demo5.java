package ArrayProgramming;

public class demo5 {
// write a program to print even elements in array
	public static void main(String[] args) {
		int arr[]= {10,21,30,47,50,60,11,44,91};
		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==0) {
//				System.out.print(arr[i]+",");
//			}
//			or
			System.out.print((arr[i]%2==0)?arr[i]+",":"");
		}
	}

}