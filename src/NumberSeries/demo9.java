package NumberSeries;

public class demo9 {

	public static void main(String[] args) {
		System.out.println("0,1,1,2,3,5,8,13,.....n");
		int i=0,j=1,n=10;
		//0
		//1
		//0+1=1
		//1+1=2
		//1+2=3
		//2+3=5 
		//3+5=8
		//5+8=13...............n
		System.out.print(i+", ");
		System.out.print(j+", ");
		for(int k=1;k<=n-2;k++) {
			int x=i,y=j;
			System.out.print((x+y)+", ");
			i=j;
			j=x+y;
		}
		
	}

}
