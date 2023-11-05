package NumberSeries;

public class demo10 {

	public static void main(String[] args) {
		System.out.println("1,1,1,3,2,5,3,7,5,9,8,11,13,.....n");
		/*
		 * 1,1,1,3,2,5,3,7,5,9,8,11,13,.....n
   index * 0,1,2,3,4,5,6,7,8,9,10, 
evenIndex* 1,1,2,3,5,8,13..........n
oddIndex * 1,3,5,7,9,11,13
		 *
		 * */
		int a = 0, b = 1, sum = 0, n = 20;
		for (int i = 1; i <= n; i++) {
			if(i%2==0) {
				sum=a+b;
				while(sum==1) {
					System.out.print(sum+", ");
					break;
				}
				System.out.print(sum+", ");
				a=b;
				b=sum;
			}
			else {
				System.out.print(i+", ");
			}
		}
	}

}
