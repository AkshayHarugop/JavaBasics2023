package codingbat.Array2;

public class problem30HaveThree {
//Q. Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

//haveThree([3, 1, 3, 1, 3]) → true
//haveThree([3, 1, 3, 3]) → false
//haveThree([3, 4, 3, 3, 4]) → false
//haveThree([1, 3, 1, 3, 1, 3, 4, 3]) → false	

	public static void main(String[] args) {
		int[] nums = { 1, 3, 1, 3, 1, 3, 4, 3 };
//		int[] nums2 = countEvens(nums);
		System.out.println(haveThree(nums));
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + ",");
//		}
	}

	public static boolean haveThree(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length - 4; i++) {
			if (nums[i] == 3 && nums[i + 2] == 3 && nums[i + 4] == 3) {
				count++;
			}
		}
		if (count == 1) {
			return true;
		} else {
			return false;
		}

	}

}
