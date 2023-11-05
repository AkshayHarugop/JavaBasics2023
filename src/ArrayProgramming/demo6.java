package ArrayProgramming;

public class demo6 {
//Q. WAP to print even or Odd indexed element in an Array
	/*
	 * arr={10,20,30,40,50}
	 *index=00,01,02,03,04
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50};
		int size=arr.length;
		for(int i=0;i<size;i++) {
			if(i%2==0) {
				System.out.print(arr[i]+",");
			}else {
//				System.out.print(arr[i]+",");
			}
		}
	}

}
