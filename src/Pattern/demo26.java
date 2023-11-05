package Pattern;

public class demo26 {

	public static void main(String[] args) {
		/*
		 *			*				11 12 13 14
		 * 			**				21 22 23 24
		 * 			***				31 32 33 34
		 * 			****			41 42 43 44
		 * 			***				51 52 53 54
		 * 			**				61 62 63 64
		 * 			*				71 72 73 74
		 */
		/* 
		int n = 8;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i >= j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= n - 1; i++) {
			for (int j = 1; j <= n - 1; j++) {
				if (i + j <= n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		//2nd method
		int m=8;
		for(int i=m;i>=-m;i--) {
			for(int j=m;j>=Math.abs(i);j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		/*
		 *			*				11 12 13 14
		 * 			**				21 22 23 24
		 * 			***				31 32 33 34
		 * 			****			41 42 43 44
		 * 			***				51 52 53 54
		 * 			**				61 62 63 64
		 * 			*				71 72 73 74
		 */
		
		
		int n=5;
		for(int i=n;i>=-n;i--) {
			for(int j=n;j>=Math.abs(i);j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}
}
