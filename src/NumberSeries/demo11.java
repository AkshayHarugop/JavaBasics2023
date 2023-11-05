package NumberSeries;

public class demo11 {

	public static void main(String[] args) {
		System.out.println("1,2,1,4,2,6,3,8,5,10,.....n");
		/*
		 * 1,2,1,4,2,6,3,8,5,10,.............n
index	 * 1,2,3,4,5,6,7,8,9,10, 
evenIndex* 2,4,6,8,10......n 
oddIndex * 1,1,2,3,5,8........n 
		 * */
		int n=20,a=0,b=1,sum=0;
		System.out.print(1+", ");
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+", ");
			}
			else {
				sum=a+b;
				System.out.print(sum+", ");
				a=b;
				b=sum;
				
			}
		}
		
	}

}
