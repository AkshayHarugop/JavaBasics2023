package codingbat.Array1;

public class problem21MakeEnds {
//Q. Given an array of ints, return a new array length 2 containing the first and last elements from the original array. 
//	The original array will be length 1 or more.

//makeEnds([1, 2, 3]) → [1, 3]
//makeEnds([1, 2, 3, 4]) → [1, 4]
//makeEnds([7, 4, 6, 2]) → [7, 2]

	public static void main(String[] args) {
		int[] nums = { 1 };
		int[] nums2 = makeEnds(nums);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + ",");
		}
	}

	public static int[] makeEnds(int[] nums) {
		if (nums.length >= 1) {
			return new int[] { nums[0], nums[nums.length - 1] };
		}
		return nums;

	}

}
