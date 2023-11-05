package codingbat.Array2;

public class problem11CountEvens {
//Q. Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

//countEvens([2, 1, 2, 3, 4]) → 3
//countEvens([2, 2, 0]) → 3
//countEvens([1, 3, 5]) → 0

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5 };
//		int[] nums2 = countEvens(nums);
		System.out.println(countEvens(nums));
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + ",");
//		}
	}

	public static int countEvens(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				count++;
			}
		}
		return count++;
	}
}
