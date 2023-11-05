package codingbat.Warmup1;

public class problem3 {
//Q. Given two int values, return their sum. Unless the two values are the same, then return double their sum.

//sumDouble(1, 2) → 3
//sumDouble(3, 2) → 5
//sumDouble(2, 2) → 8

	public static void main(String[] args) {
		System.out.println(sumDouble(4, 2));
	}

	public static int sumDouble(int a, int b) {
		int sum = 0;
		if (a == b) {
			sum = (a + b) * 2;
		} else {
			sum = a + b;
		}
		return sum;
	}
}