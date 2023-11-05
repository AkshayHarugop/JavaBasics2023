package codingbat.Array2;

public class problem18Sum28 {
//Q. Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

//sum28([2, 3, 2, 2, 4, 2]) → true
//sum28([2, 3, 2, 2, 4, 2, 2]) → false
//sum28([1, 2, 3, 4]) → false

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
//		int[] nums2 = countEvens(nums);
		System.out.println(sum28(nums));
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + ",");
//		}
	}

	public static boolean sum28(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				count++;
			}
		}

		return (count * 2 == 8) ? true : false;

	}
}
