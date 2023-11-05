package codingbat.Array2;

public class problem13CenteredAverage {
//Q. Return the "centered" average of an array of ints, which we'll say is the mean average of the values, 
//	except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, 
//	and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.

//centeredAverage([1, 2, 3, 4, 100]) → 3
//centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
//centeredAverage([-10, -4, -2, -4, -2, 0]) → -3

	public static void main(String[] args) {
		int[] nums = { -10, -4, -2, -4, -2, 0 };
//		int[] nums2 = countEvens(nums);
		System.out.println(centeredAverage(nums));
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + ",");
//		}
	}

	public static int centeredAverage(int[] nums) {
		int small = nums[0], big = nums[0], s = 0, b = 0, sum = 0, count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (small > nums[i]) {// 3<10
				small = nums[i];
				s = i;
			}
			if (big < nums[i]) {
				big = nums[i];
				b = i;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (i == s || i == b) {

			} else {
				sum = sum + nums[i];
				count++;
			}
		}

		return sum / count;

	}
}
