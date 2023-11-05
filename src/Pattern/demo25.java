package Pattern;

public class demo25 {

	public static void main(String[] args) {
		/*
		 	*****			11	12	13	14	15
		 	 ****			21	22	23	24	25
		 	  ***			31	32	33	34	35
		 	   **			41	42	43	44	45
		 		*			51	52	53	54	55
		 */
		
		int n=5;
		int m=n*2-1; //m=9
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i+j)>=(i+i)) {
					System.out.print(m+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			for(int l=1;l<=(n-1);l++) {
				if((i+l)<=n) {
					System.out.print(m+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			m=m-2;
	}
		
		
		
		
		
		/*
	 		****			11	12	13	14	
	 		***				21	22	23	24	
	 		**				31	32	33	34	
	 		*				41	42	43	44	
	 	*/
		
//		for(int k=1;k<=(n-1);k++) {
//			for(int l=1;l<=(n-1);l++) {
//				if((k+l)<=n) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
//		int m=10;
//		for(int k=m;k>=0;k--) {
//			if(k%2!=0) {
//				System.out.print(k+" ");
//			}
//		}
		
		
		
		/*
			for(int i=1;i<=n;i++) {
			int m=n*2; //m=10
			for(int j=1;j<=n;j++) {
				if((i+j)>=(i+i)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			for(int l=1;l<=(n-1);l++) {
				if((i+l)<=n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		 */
		
	}

}
