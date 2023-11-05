package Pattern;

public class demo24 {

	public static void main(String[] args) {
		/*// refer the demo25
		 * 	  999999999
		 * 	   7777777
		 * 	    55555
		 * 	     333
		 * 	      1
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
		
	}

}
