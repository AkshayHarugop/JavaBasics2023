package ArrayProgramming;

public class demo3 {
//Q. WAP to print array in reverse order
	/*
	 * arr={10,20,30,40,50}
	 * reverse array = 50,40,30,20,10;
	 */
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+",");
		}
	}

}
