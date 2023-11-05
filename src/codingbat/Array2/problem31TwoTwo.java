package codingbat.Array2;

public class problem31TwoTwo {
//Q. Given an array of ints, return true if every 2 that appears in the array is next to another 2.

//twoTwo([4, 2, 2, 3]) → true
//twoTwo([2, 2, 4]) → true
//twoTwo([2, 2, 4, 2]) → false

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4 };
//		int[] nums2 = countEvens(nums);
		System.out.println(twoTwo(nums));
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + ",");
//		}
	}

	public static boolean twoTwo(int[] nums) {
		for (int i = 0; i < (nums.length); i++) {
			if (nums[i] == 2) {
				i++;
				if (!(i < (nums.length)) || nums[i] != 2)
					return false;
				while (i < nums.length && nums[i] == 2)
					i++;
			}
		}
		return true;

	}
}
