package Pattern;

public class demo16 {

	public static void main(String[] args) {
	/*  // excute below program
		 * 	DCBA		11 12 13 14   68 67 66 65
		 * 	DCBA		21 22 23 24   68 67 66 65 
		 * 	DCBA		31 32 33 34   68 67 66 65
		 * 	DCBA		41 42 43 44   68 67 66 65
		 * 		 *///68
		int n=26;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}
}
