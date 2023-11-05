package codingbat.Array1;

public class problem13MakePi {
//Q. Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

//makePi() → [3, 1, 4]
	
	public static void main(String[] args) {
		int[] nums = makePi();
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+",");
		}
	}
	public static int[] makePi() {
		int[] nums = new int[] {3,1,4};
		return nums;
	}
}