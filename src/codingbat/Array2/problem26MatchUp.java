package codingbat.Array2;

public class problem26MatchUp {
//Q. Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). 
//	 Return the count of the number of times that the two elements differ by 2 or less, but are not equal.

//	matchUp([1, 2, 3], [2, 3, 10]) → 2
//	matchUp([1, 2, 3], [2, 3, 5]) → 3
//	matchUp([1, 2, 3], [2, 3, 3]) → 2

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 2, 3, 3 };
//		int[] nums2 = countEvens(nums);
		System.out.println(matchUp(nums1, nums2));
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + ",");
//		}
	}

	public static int matchUp(int[] nums1, int[] nums2) {
		int count = 0;
		for (int i = 0; i < nums1.length; i++) {
			if (nums1[i] != nums2[i]) {
				if (Math.abs(nums1[i] - nums2[i]) <= 2)
					count++;
			}

		}

		return count;

	}
}
