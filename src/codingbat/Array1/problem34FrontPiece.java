package codingbat.Array1;

public class problem34FrontPiece {
//Q. Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

//frontPiece([1, 2, 3]) → [1, 2]
//frontPiece([1, 2]) → [1, 2]
//frontPiece([1]) → [1]

	public static void main(String[] args) {
		int[] a = { 1 };
		int[] nums2 = frontPiece(a);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + ",");
		}
	}

	public static int[] frontPiece(int[] nums) {
		if (nums.length > 2) {
			return new int[] { nums[0], nums[1] };
		} else {
			return nums;
		}
	}
}
