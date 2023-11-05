package Pattern;

public class demo18 {

	public static void main(String[] args) {
		/*
		 * 	2 3 4 5 6			11	12	13	14	15
		 * 	3 4 5 6 7			21	22	23	24	25
		 * 	4 5 6 7 8			31	32	33	34	35
		 * 	5 6 7 8 9			41	42	43	44	45
		 * 	6 7 8 9 10			51	52	53	54	55
		 * 
		 */
		int n=5,k,l=2,m;
		for(int i=1;i<=n;i++) {
			k=l;
			m=l;
			for(int j=1;j<=n;j++) {
			if(i==j) {
				System.out.print((char)(m+63)+" ");
				m++;
			}
			else {
				System.out.print(k+" ");
			}
			k++;
				if(j==1) {
					l=k;
				}
			}
			System.out.println();
		}
		
		
		
		
		/*  int n=5,k,l=2;
		for(int i=1;i<=n;i++) {
			k=l;
			for(int j=1;j<=n;j++) {
			System.out.print(k+" ");
			k++;
				if(j==1) {
					l=k;
				}
			}
			System.out.println();
		}*/
		
	}

}
