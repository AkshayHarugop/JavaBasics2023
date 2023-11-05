package Pattern;

public class demo32 {

	public static void main(String[] args) {
		/*
		 		****
		 		***
		 		**
		 		*
		 		**
		 		***
		 		****
		 
		 */
		
		int n=4;
		for(int i=1;i<=-n;i++) {
			for(int j=n;j>=Math.abs(i);j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
