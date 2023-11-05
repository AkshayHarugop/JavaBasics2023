package Pattern;

public class demo28 {

	public static void main(String[] args) {
		/*
		 * 			*
		 * 		   * *
		 * 		  * * *
		 * 		 * * * *
		 * 		  * * *
		 * 		   * *
		 * 			*
		 * 
		 */
		int no=5,n=no-1;
		for(int i=n;i>=-n;i--) {
			for(int j=1;j<=Math.abs(i);j++) {
				System.out.print(" ");
			}
			for(int j=n;j>=Math.abs(i);j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
