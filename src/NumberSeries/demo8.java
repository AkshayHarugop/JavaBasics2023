package NumberSeries;

public class demo8 {

	public static void main(String[] args) {
		System.out.println("1,3,6,10,15,21,28.....n");
		int n=10;
		//0+1=1
		//1+2=3
		//3+3=6
		//6+4=10 
		//10+5=15
		//......n
		int count =0;
		for(int i=1;i<=n;i++) {
			count = count+i;
			System.out.print(count+", ");
		}
	}
}
