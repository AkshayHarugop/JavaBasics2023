package codingbat.Array2;

public class problem25Either24 {
//Q. Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

//either24([1, 2, 2]) → true
//either24([4, 4, 1]) → true
//either24([4, 4, 1, 2, 2]) → false

	public static void main(String[] args) {
		int[] nums = { 4, 4, 1, 2, 2 };
//		int[] nums2 = countEvens(nums);
		System.out.println(either24(nums));
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + ",");
//		}
	}

	public static boolean either24(int[] nums) {
		int two = 0, four = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				two++;
			}
			if (nums[i] == 4 && nums[i + 1] == 4) {
				four++;
			}
		}

		if (two != 0 && four != 0)
			return false;
		else if (two != 0 || four != 0)
			return true;
		else
			return false;
	}
}
