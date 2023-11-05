package Recursion;

public class demo7 {
	private static int m = 5;
//Q. Print this type of series 1,2,3,4,5,4,3,2,1
	//2nd Logic from the tech
	public static void main(String[] args) {
		display(1);
	}

	public static void display(int x) {
		if(m-->1) {
			System.out.print(x+",");
			display(x+1);
			
		}
		System.out.print(x+",");  
	}
//1st Logic from the me
//	public static void main(String[] args) {
//		series(m);
//	}
//
//	static int i = 1, j = m;
//
//	public static void series(int n) {
//		if (i == m + 1 || j == 0)
//			return;
//		if (i < m) {
//			System.out.print(i + ",");
//			i = i + 1;
//			series(i);
//		}
//		if (j >= 1) {
//			System.out.print(j + ",");
//			j = j - 1;
//			series(j);
//		}
//	}
}