package ArrayProgramming;

public class demo8 {
//Q. Sorting an array
	/*bubble sorting 
	 * arr={5,4,3,2,1}
	 */
	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 2, 1, 10, 8, 7, 6, 9 };
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
//				if (arr[j] > arr[j + 1]) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i : arr) {
			System.out.print(i + ",");
		}
	}

}
