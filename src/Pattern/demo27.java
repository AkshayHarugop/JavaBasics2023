package Pattern;

public class demo27 {

	public static void main(String[] args) {
		/*
		 *			   *				11 12 13 14
		 * 			  **				21 22 23 24
		 * 			 ***				31 32 33 34
		 * 			****				41 42 43 44
		 * 			 ***				51 52 53 54		11	12	13	14
		 * 			  **				61 62 63 64		21	22	23	24
		 * 			   *				71 72 73 74		31	32	33	34
		 */
		
		int nu=6,n=nu-1;
		for(int i=n;i>=-n;i--) {
			for(int j=1;j<=Math.abs(i);j++) {
				System.out.print("  ");
			}
			for(int j=n;j>=Math.abs(i);j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		/*
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j>=n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		int m=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j>=m) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			m=m+2;
			System.out.println();
		}
		*/
	}

}
