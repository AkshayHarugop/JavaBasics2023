package NumberSeries;

public class demo7 {
	public static void main(String[] args) {
		System.out.println("1,4,9,16,25,36,49.....n");
		int n=10;
		// 0+1=1// 1+3=4// 4+5=9// 9+7=16// 16+9=25//......n
//		OR
		//1^2=1
		//2^2=4
		//3^2=9
		//4^2=16
		//5^2=25
		//......n
		
		for(int i=1;i<=n;i++) {
			System.out.print((int)Math.pow(i, 2)+", ");
		}
	}

}
