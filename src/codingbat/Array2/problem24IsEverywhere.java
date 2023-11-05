package codingbat.Array2;

public class problem24IsEverywhere {
//Q. We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. 
//	 Return true if the given value is everywhere in the array.

//isEverywhere([1, 2, 1, 3], 1) → true
//isEverywhere([1, 2, 1, 3], 2) → false
//isEverywhere([1, 2, 1, 3, 4], 1) → false

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1, 3, 4 };
//		int[] nums2 = countEvens(nums);
		System.out.println(isEverywhere(nums, 1));
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + ",");
//		}
	}

	public static boolean isEverywhere(int[] nums, int val) {
		boolean result = true;
		for (int i = 0; i <= nums.length - 2; i++) {
			if (nums[i] != val && nums[i + 1] != val)
				result = false;
		}
		return result;

	}
}
