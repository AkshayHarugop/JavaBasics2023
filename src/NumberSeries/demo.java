package NumberSeries;

public class demo {

	public static void main(String[] args) {
		int n=100;
		int lp=0;
		for(int i=1;i<=n;i++) {
			System.out.print(i+", ");
			lp++;
		}
		System.out.println("\n"+lp);
		
		System.out.println("======================");
		System.out.println("Optimizing the code : ");
		int lp1=0;
		for(int i=1;i<=n;i++) {
			System.out.print(i +", ");
			System.out.print(++i	 +", ");
			lp1++;
		}
		System.out.println("\n"+lp1);
		
		System.out.println("======================");
		System.out.println("Optimizing the code : ");
		int lp2=0;
		for(int i=1;i<=n;i++) {
			System.out.print(i +", "+ ++i +", "+ ++i +", "+ ++i +", ");
			lp2++;
		}
		System.out.println("\n"+lp2);
	}

}
