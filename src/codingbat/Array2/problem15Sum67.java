package codingbat.Array2;

public class problem15Sum67 {
//Q. Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 
//	 (every 6 will be followed by at least one 7). Return 0 for no numbers.

//sum67([1, 2, 2]) → 5
//sum67([1, 2, 2, 6, 99, 99, 7]) → 5
//sum67([1, 1, 6, 7, 2]) → 4
//sum67([1, 6, 2, 2, 7, 1, 6, 99, 99, 7]) → 2
//sum67([2, 7, 6, 2, 6, 7, 2, 7]) → 18	

	public static void main(String[] args) {
		int[] nums = { 2, 7, 6, 2, 6, 7, 2, 7 };
//		int[] nums2 = countEvens(nums);
		System.out.println(sum67(nums));
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + ",");
//		}
	}

	public static int sum67(int[] nums) {
		int sum = 0;
		boolean stop = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 6) {
				stop = true;
			}
			if (stop == false) {
				sum += nums[i];
			}
			if (nums[i] == 7 && stop == true) {
				stop = false;
			}
		}

		return sum;
		
		
		
		
		
		

//		int sum = 0;
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] == 6 && nums[i + 1] == 7) {
//				sum = sum + nums[i + 2];
//				i = i + 2;
//			} else if (nums[i] == 6) {// i=1
//				for (int j = i + 1; j < nums.length - 1; j++) {// j=1,4
//					if (nums[j] == 7) {
//						sum = sum + nums[j + 1];
//						i = i + j;
//						break;
//					} 
//					if(nums[j] == 6) {
//						i=j;
//						break;
//					}
//				}
//				break;
//			} else {
//				sum = sum + nums[i];
//			}
//		}
//
//		return sum;
	}
}
