package NumberSeries;

public class demo5 {

	public static void main(String[] args) {
		System.out.println("1,2,9,28,65,.....n");
		int n=10;
				// (0^3)+1=1
				// (1^3)+1=2
				// (2^3)+1=9
				// (3^3)+1=28
				// (4^3)+1=65
//				......n
		
		for(int i=0;i<n;i++) {
			System.out.print((int)(Math.pow(i, 3)+1)+", ");
		}
		
	}

}
