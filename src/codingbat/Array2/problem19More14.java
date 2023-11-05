package codingbat.Array2;

public class problem19More14 {
//Q. Given an array of ints, return true if the number of 1's is greater than the number of 4's

//more14([1, 4, 1]) → true
//more14([1, 4, 1, 4]) → false
//more14([1, 1]) → true

	public static void main(String[] args) {
		int[] nums = { 1, 1 };
//		int[] nums2 = countEvens(nums);
		System.out.println(more14(nums));
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + ",");
//		}
	}

	public static boolean more14(int[] nums) {
		int count1 = 0, count4 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count1++;
			}
			if (nums[i] == 4) {
				count4++;
			}
		}
		return (count1 > count4) ? true : false;

	}
}
