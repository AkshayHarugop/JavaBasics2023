package Pattern;

public class demo12 {

	public static void main(String[] args) {
	/*  // excute C
		 * 	 ***		11 12 13 14 15
		 * 	*			21 22 23 24 25
		 * 	*			31 32 33 34 35
		 * 	*			41 42 43 44 45
		 * 	 ***		51 52 53 54 55
		 */
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1&&j==1||i==1&&j==n||i==n&&j==1||i==n&&j==n) {
					System.out.print("  ");
				}
				else if(i==1||i==n||j==1) {
					System.out.print("* ");
				}
				
			}
			System.out.println("");
		}
	}

}
