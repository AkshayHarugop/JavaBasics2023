package ArrayProgramming;

public class demo11 {
//Q. Find the unique element in the given array
	/*
	 * ex arr={10,1,5,1,3,10,9,3,5,2,6,0,10,11,,} in the above array unique elements
	 * are 9,2,6 so O/P : 9,2,6,11
	 */
	public static void main(String[] args) {
//		System.out.println((char)0);
		int arr[] = { 10, 1, 5, 1, 3, 10, 9, 3, 5, 2, 6, 0, 10, 1, 2, 3, 4, 5, 6, 7, 8, 4, 7, 8 };
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = (char) 0;
					count++;
				}
			}
			if (count == 0 && arr[i] != (char) 0) {
				System.out.print(arr[i] + ",");
			} else {
				arr[i] = (char) 0;
			}
		}
	}

}
