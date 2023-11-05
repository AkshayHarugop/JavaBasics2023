package LogicalPrgm1;

public class demo7 {
	public static void main(String[] args) {
//Q. write a program for power of n 
		/*
		 * 2^3
		 * 2^3 is equal to : 8
		 * 2*2*2=8
		 */
		
		int b=4,p=3,res=1;
		for(int i=1;i<=p;i++) {
			res=res*b;
		}
		System.out.println(res);
	}
}
