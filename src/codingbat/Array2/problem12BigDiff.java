package codingbat.Array2;

public class problem12BigDiff {
//Q. Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. 
//	 Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

//bigDiff([10, 3, 5, 6]) → 7
//bigDiff([7, 2, 10, 9]) → 8
//bigDiff([2, 10, 7, 2]) → 8

	public static void main(String[] args) {
		int[] nums = { 2, 10, 7, 2 };
//		int[] nums2 = countEvens(nums);
		System.out.println(bigDiff(nums));
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + ",");
//		}
	}

	public static int bigDiff(int[] nums) {
		int small = nums[0], big = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (small > nums[i]) {// 3<10
				small = nums[i];
			}
			if (big < nums[i]) {
				big = nums[i];
			}
		}

		return Math.abs(big - small);
	}
}
