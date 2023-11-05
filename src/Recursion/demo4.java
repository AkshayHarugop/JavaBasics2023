package Recursion;

public class demo4 {
	static int n=1;
	public static void displayEvenNumber(int count) {
		if (n > count * 2)
			return;
		if (n % 2 == 0) {
			System.out.print(n + ",");
			n+=2;
			displayEvenNumber(count);
		} else {
			n+=1;
			displayEvenNumber(count);
		}

	}

	public static void main(String[] args) {
//Q. Print n even Numbers 
		/*
		 * n=10 O/P : 2,4,6,8,10,12,14,16,18,20,
		 */
		displayEvenNumber(10);
	}

}
