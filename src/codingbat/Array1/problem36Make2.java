package codingbat.Array1;

public class problem36Make2 {
//Q. Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.

//make2([4, 5], [1, 2, 3]) → [4, 5]
//make2([4], [1, 2, 3]) → [4, 1]
//make2([], [1, 2]) → [1, 2]

	public static void main(String[] args) {
		int[] a = {};
		int[] b = { 1, 2, 3 };
		int[] nums2 = make2(a, b);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + ",");
		}
	}

	public static int[] make2(int[] a, int[] b) {
		if (a.length >= 2) {
			return new int[] { a[0], a[1] };
		} else if (a.length == 1) {
			return new int[] { a[0], b[0] };
		} else if (a.length == 0) {
			return new int[] { b[0], b[1] };
		} else {
			return new int[] { 0, 0 };
		}
	}
}
