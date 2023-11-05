package StringPrograms;

public class demo2 {
//Q. WAP to find the number of words in the given sentence
	/*
	 * s = "Belagavi is a beautiful city"
	 * O/P : 5;
	 */
	public static void main(String[] args) {
		String s = "Belagavi_is_a_beautiful_city";
		String[] SA = s.split("_");
		for(String i : SA) {
			System.out.print(i+" ");
		}
	}

}
