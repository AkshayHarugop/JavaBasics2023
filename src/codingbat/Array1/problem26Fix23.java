package codingbat.Array1;

public class problem26Fix23 {
//Q.Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.

//fix23([1, 2, 3]) → [1, 2, 0]
//fix23([2, 3, 5]) → [2, 0, 5]
//fix23([1, 2, 1]) → [1, 2, 1]

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		int[] nums2 = fix23(nums);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + ",");
		}
	}

	public static int[] fix23(int[] nums) {
		if (nums[0] == 2 && nums[1] == 3)
			nums[1] = 0;
		if (nums[1] == 2 && nums[2] == 3)
			nums[2] = 0;
		return new int[] { nums[0], nums[1], nums[2] };

//		for (int i = 1; i < nums.length; i++) {
//			if (nums[i] == 3) {
//				nums[i] = 0;
//				break;
//			}
//		}
//		return nums;

	}
}
