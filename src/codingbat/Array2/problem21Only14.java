package codingbat.Array2;

public class problem21Only14 {
//Q. Given an array of ints, return true if every element is a 1 or a 4.

//only14([1, 4, 1, 4]) → true
//only14([1, 4, 2, 4]) → false
//only14([1, 1]) → true

	public static void main(String[] args) {
		int[] nums = { 1, 1 };
//		int[] nums2 = countEvens(nums);
		System.out.println(only14(nums));
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + ",");
//		}
	}

	public static boolean only14(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 || nums[i] == 4)
				count++;
		}

		return (count == nums.length) ? true : false;
	}
}
