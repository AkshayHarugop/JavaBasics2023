package ArrayProgramming;

public class demo4 {
//Q. WAP to reverse the given array
	/*
	 * arr={10,20,30,40,50}
	 * size=5; 5/2=2;
	 * swipe first and last element in 1st iteration
	 * swipe 2nd and last but second element in 2nd iteration
	 * Done
	 * or b=a+b-(a=b);
	 */
	public static void main(String[] args) {
//		int a=10,b=20,temp;
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println(a);
//		System.out.println(b);
//		int temp[]= {60};
		int arr[]={10,20,30,40,50,60,70,80,90};
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		
		for(int i:arr) {
			System.out.print(i+",");
		}
		
	}

}
