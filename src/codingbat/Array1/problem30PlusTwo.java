package codingbat.Array1;

public class problem30PlusTwo {
//Q. Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

//plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
//plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
//plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]

	public static void main(String[] args) {
		int[] a = { 2, 2 };
		int[] b = { 1, 3 };
		int[] nums2 = plusTwo(a, b);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + ",");
		}
	}

	public static int[] plusTwo(int[] a, int[] b) {
		return new int[] { a[0], a[1], b[0], b[1] };
	}
}
