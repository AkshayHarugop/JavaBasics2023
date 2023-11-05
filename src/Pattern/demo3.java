package Pattern;

public class demo3 {

	public static void main(String[] args) {
		/*
		 	* 			11 12 13 14
		 	 *      	21 22 23 24
		      * 		31 32 33 34
		       * 		41 42 43 44
		 */
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	/*
	 	 	*		11 12 13 14
	 	   *     	21 22 23 24
	      * 		31 32 33 34
	     *   		41 42 43 44
	*/
		int k=n;int l=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==l&&j==k) {
					System.out.print("* ");
					 l++;
					 k--;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
		
		//OR 1+4=5;2+3=5;3+2=5;4+1=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j==(n+1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		
		
	}

}
