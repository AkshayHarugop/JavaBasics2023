package codingbat.Array1;

public class problem37Front11 {
//Q. Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.

//front11([1, 2, 3], [7, 9, 8]) → [1, 7]
//front11([1], [2]) → [1, 2]
//front11([1, 7], []) → [1]

	public static void main(String[] args) {
		int[] a = {};
		int[] b = { 1, 7 };
		int[] nums2 = front11(a, b);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + ",");
		}
	}

	public static int[] front11(int[] a, int[] b) {
		if (a.length > 0 && b.length > 0)
			return new int[] { a[0], b[0] };
		else if (a.length > 0 && b.length == 0)
			return new int[] { a[0] };
		else if (a.length == 0 && b.length > 0)
			return new int[] { b[0] };
		else
			return new int[] {};
	}
}