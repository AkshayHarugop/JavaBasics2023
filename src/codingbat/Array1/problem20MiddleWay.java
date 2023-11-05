package codingbat.Array1;

public class problem20MiddleWay {
//Q. Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

//middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
//middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
//middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };
		int[] nums2 = middleWay(a, b);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + ",");
		}
	}

	public static int[] middleWay(int[] a, int[] b) {
		return new int[] { a[1], b[1] };

	}
}
