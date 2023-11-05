package Pattern;

public class demo21 {

	public static void main(String[] args) {
	/*
		 * 		*					11	12	13	14	15
		 * 	   **					21	22	23	24	25
		 * 	  ***					31	32	33	34	35
		 * 	 ****					41	42	43	44	45
		 * 	*****					51	52	53	54	55
		 */
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i+j)>=(n+1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("==============");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++)
				System.out.print("  ");
			for(int j=1;j<=i;j++)
				System.out.println("* ");
			System.out.println();
		}
		
		
	}

}
