package codingbat.Array2;

public class problem23No14 {
//Q. Given an array of ints, return true if it contains no 1's or it contains no 4's.

//			no14([1, 2, 3]) → true
//			no14([1, 2, 3, 4]) → false
//			no14([2, 3, 4]) → true
//			no14([2]) → true	

	public static void main(String[] args) {
		int[] nums = { 2 };
//		int[] nums2 = countEvens(nums);
		System.out.println(no14(nums));
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + ",");
//		}
	}

	public static boolean no14(int[] nums) {
		int count1 = 0, count4 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1)
				count1++;
			if (nums[i] == 4)
				count4++;
		}

		if (count1 > 0 && count4 > 0)
			return false;
		else if (count1 >= 0 || count4 >= 0)
			return true;
		else
			return false;
	}

}
