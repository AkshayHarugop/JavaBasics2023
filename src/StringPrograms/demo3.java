package StringPrograms;

public class demo3 {
//Q. WAP to find the number of char in the given word without inbuilt length() method
	/*
	 * word : Belagavi 
	 * Char : 8
	 */
	public static void main(String[] args) {
		String W = "Belagavi";
		char c[] = W.toCharArray();
		int count = 0;
		for (char i : c) {
			count++;
		}
		System.out.println(count);
	}

}
