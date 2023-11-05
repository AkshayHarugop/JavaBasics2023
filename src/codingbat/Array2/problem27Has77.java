package codingbat.Array2;

public class problem27Has77 {
//Q. Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.

//			has77([1, 7, 7]) → true
//			has77([1, 7, 1, 7]) → true
//			has77([1, 7, 1, 1, 7]) → false
//			has77([2, 7, 2, 2, 7, 2]) → false	

	public static void main(String[] args) {
		int[] nums = { 2, 7, 2, 2, 7, 2 };
//		int[] nums2 = countEvens(nums);
		System.out.println(has77(nums));
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + ",");
//		}
	}

	public static boolean has77(int[] nums) {
		for(int i = 0; i < nums.length - 1; i++) {
	        if(nums[i] == 7 && nums[i+1] == 7)
	            return true;
	                  
	        if(i <= nums.length - 3 && nums[i] == 7 && nums[i+2] == 7)
	            return true;
	    }
	                                
	    return false;
	}
}
