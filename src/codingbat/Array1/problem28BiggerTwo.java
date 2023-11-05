package codingbat.Array1;

public class problem28BiggerTwo {
//Q. Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. 
//	In event of a tie, return a.

//biggerTwo([1, 2], [3, 4]) → [3, 4]
//biggerTwo([3, 4], [1, 2]) → [3, 4]
//biggerTwo([1, 1], [1, 2]) → [1, 2]

	public static void main(String[] args) {
		int[] a = { 2, 2 };
		int[] b = { 1, 3 };
		int[] nums2 = biggerTwo(a, b);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + ",");
		}
	}

	public static int[] biggerTwo(int[] a, int[] b) {
		if ((b[1] + b[0]) > (a[1] + a[0]))
			return b;
		else
			return a;
	}
}