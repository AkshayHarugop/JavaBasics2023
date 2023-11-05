package NumberSeries;

public class demo6 {

	public static void main(String[] args) {
		System.out.println("1,2,4,7,11,.....n");
		int n=10;
		// 0+1=1
		// 1+1=2
		// 2+2=4
		// 4+3=7
		// 7+4=11
		//......n
		int count =1;
		for(int i =0;i<n;i++) {
			count =count +i;
			System.out.print(count+", ");
		}
		
		
	}

}
