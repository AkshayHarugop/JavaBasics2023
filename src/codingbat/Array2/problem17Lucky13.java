package codingbat.Array2;

public class problem17Lucky13 {
//Q. Given an array of ints, return true if the array contains no 1's and no 3's.

//lucky13([0, 2, 4]) → true
//lucky13([1, 2, 3]) → false
//lucky13([1, 2, 4]) → false

	public static void main(String[] args) {
		int[] nums = { 0, 2, 4 };
//		int[] nums2 = countEvens(nums);
		System.out.println(lucky13(nums));
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + ",");
//		}
	}

	public static boolean lucky13(int[] nums) {
		int count1 = 0, count2 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count1++;
			} else if (nums[i] == 3) {
				count2++;
			}
		}

		return (count1 > 0 || count2 > 0) ? false : true;

	}
}
