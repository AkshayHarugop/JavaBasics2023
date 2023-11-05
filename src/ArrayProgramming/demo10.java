package ArrayProgramming;

public class demo10 {
//Q.WAP to rotate given array towards rt side
	/*
	 * arr={10,20,30,40,50} o/p: 50,10,20,30,40
	 */
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		int size = arr.length;
		for (int j = 0; j < 2; j++) {
			int temp = arr[size - 1];
			for (int i = size - 1; i >= 0; i--) {
				if (i == 0) {
					arr[0] = temp;
				} else {
					arr[i] = arr[i - 1];
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + ",");
		}
	}

}
