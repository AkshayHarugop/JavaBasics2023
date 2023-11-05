package ArrayProgramming;

public class demo7 {
//Q. WAP to print largest element in an Array
		/*
		 * arr={10,20,30,40,50}
		 *Largest element in and array is 50
		 */
	public static void main(String[] args) {
		int arr[]={10,20,60,30,40,50,9};
		int temp=arr[0];
		for(int i=0;i<arr.length;i++) {
			int b=arr[i];
			if(temp>b) {//
				temp=b;
			}
		}
		System.out.println(temp);
	}

}
