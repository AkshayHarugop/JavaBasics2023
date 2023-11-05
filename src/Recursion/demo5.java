package Recursion;

public class demo5 {
// Q. Print n odd Numbers
	/*
	 * n=10 O/P : 1,3,5,7,9,11,13,15,17,19,
	 */
	public static void main(String[] args) {
		displayOddNumber(20);
	}
	static int i=1;
	public static void displayOddNumber(int count) {
		if (i > count * 2)
			return;
		if (i % 2 == 0) {
			i+=1;
			displayOddNumber(count);
		}
		else {
			System.out.print(i + ",");
			i+=2;
			displayOddNumber(count);
		}
	}
}