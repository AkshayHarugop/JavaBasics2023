package codingbat.Array1;

public class problem24MakeLast {
//Q. Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. 
//	The original array will be length 1 or more. Note: by default, a new int array contains all 0's.

//makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
//makeLast([1, 2]) → [0, 0, 0, 2]
//makeLast([3]) → [0, 3]

	public static void main(String[] args) {
		int[] nums = { 4, 5, 6 };
		int[] nums2 = makeLast(nums);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + ",");
		}
	}

	public static int[] makeLast(int[] nums) {
		int[] num = new int[nums.length * 2];
		num[nums.length * 2 - 1] = nums[nums.length - 1];
		return num;
	}
}
