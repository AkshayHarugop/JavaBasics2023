package NumberSeries;

public class Demo4 {

	public static void main(String[] args) {
		System.out.println("1,2,4,8,16,.........n");
		int n=10;
		// 2^0=1
		// 2^1=2
		// 2^2=4
		// 2^3=8
		// 2^4=16
		// 2^5=32
//		................
		System.out.println("1st method : ");
		for(int i=0;i<n;i++) {
			System.out.print((int)Math.pow(2, i)+", ");
		}
		
		System.out.println("\n==============");
		System.out.println("2nd method ");
		for(int i=0;i<n;i++) {
			System.out.print((1<<i)+", ");
		}
	}
}
